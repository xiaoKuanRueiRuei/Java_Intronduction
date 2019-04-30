/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Java著名陷阱
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        //class name+"@"+hashcode
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("a == b: " + (a == b));
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("Arrays.equals(a,b): " + Arrays.equals(a, b));

        //即使內容相同，依舊不是同一筆資料
        //就像兩本一樣的書，可是是獨立兩本書
        //run:
        //a=[I@15db9742-->類別名稱，@後面的亂碼是獨一無二的身分證字號(記憶體位子)
        //b=[I@6d06d69c-->因為a,b的記憶體位子不同，因此是不同資料
        //只要不是那八種型態，就是物件
        //物件導向的東西不能使用"=="(雙等號)，因為即使資料相同，也不代表記憶體位子相同
        //因此在物件導向中，不同記憶體位子相同資料在"=="下，會被boolean辨識為false
        //a == b: false
        //a.equals(b): false-->除非用去改，不然用Java會用內定的陣列來判定
        //Arrays.equals(a,b): true-->這才是Java的正式版本，要用Arrays才能比對內容是否相同
        //BUILD SUCCESSFUL (total time: 0 seconds)
        int[] a1 = {1, 2, 3};
        int[] b1 = a1;//這邊將a=b，和上述程式不同

        //class name+"@"+hashcode
        System.out.println("a=" + a1);
        System.out.println("b=" + b1);
        System.out.println("a == b: " + (a1 == b1));
        System.out.println("a.equals(b): " + a1.equals(b1));
        System.out.println("Arrays.equals(a,b): " + Arrays.equals(a1, b1));

        //run:
        //a=[I@15db9742
        //b=[I@15db9742
        //a == b: true
        //a.equals(b): true
        //Arrays.equals(a,b): true
        //BUILD SUCCESSFUL (total time: 0 seconds)
        //因為a=b了，因此記憶體位子相同了，這就好像這個物件有兩個名字
        //Java在陣列比對時有如此現象，需要多注意!!!
        //Bound checking
        int[] a2 = {1, 2, 3};
        a2[10] = 10;
        System.out.println(Arrays.toString(a2));

        //綠色箭頭左邊clean and build是將過去資料編譯
        //第70行 a[10] 明顯錯誤，可是編譯器卻認為是合法的
        //綠色箭頭才是編譯並執行
        //run:
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
        //at javaapplication1.JavaApplication1.main(JavaApplication1.java:70)
        //Java Result: 1
        //BUILD SUCCESSFUL (total time: 0 seconds)
        //在綠色箭頭執行時發現是非法的(中斷)
        //此為執行時的非法程式
        //然而在C語言中，於編譯及執行階段皆不會發現是非法的(Java有改善了，Java至少在執行階段會發現)
        //C語言執行後會出現一串亂碼(莫名其妙出現的資料)
        //C語言當時是為了增加速度，因此將所有的安全措施給移除了-->地雷多、駭客攻擊目標
        //C不檢查編譯和執行
        //C語言適合程式之神(燦笑)用
        //Python本身是用C語言寫的
        //Variable
        int s = 0;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        System.out.println("s = " + s);
        System.out.println("i = " + i);

        //於編譯階段即被擋下了
        int s2 = 0;
        int n2 = 10;
        int i = 1;
        for (; i <= n; i++) {
            s += i;
        }
        System.out.println("s = " + s2);
        System.out.println("i = " + i2);

        //run:
        //s = 55
        //i = 11
        //BUILD SUCCESSFUL (total time: 0 seconds)
        //此之迴圈變數(i)在外面(第102行)，因為i在for迴圈的外面，因此可以找出i
        //但是上面的程式由於i在for迴圈裡面
        //可見範圍
        //裡面可以看外面
        //外面看不到裡面
        //裡面和外面的分別於大括號的存在
        int outer = 1;
        {
            int inner = 2;
            System.out.println("inner = " + inner);
            System.out.println("outer = " + outer);

        }
        int inner = 3;
        System.out.println("inner = " + inner);
        System.out.println("outer = " + outer);

        //run:
        //inner = 2
        //outer = 1
        //inner = 3-->新的變數(inner = 3)，和裡面的inner = 2 無關，因為他在{}外面，離開{}，inner = 2 就不見了!
        //outer = 1
        //BUILD SUCCESSFUL (total time: 0 seconds)
        
        //Basic Formating
        int n3 = 10;
        for (int i2 = 1; i2 <= n3; i2++) {
            System.out.printf("%5d %5d %5d\n3", i2, i2 * i2, i2 * i2 * i2);
            //%5d就是要擺五個格子，不到五個格子就塞空白
            //System.out.println("");-->只能擺一個東西
            //System.out.printf("");-->可以擺其他東西，且會換行
            //現在的東西是圖形輸出元件(圖形介面沒有文字輸入輸出的東西了)
            //Java只要是為了網路而寫的(原本只有println)
            //為了供應大量市場
            //因此將C語言中的"printf"又加回來了
        }
        //run:
        //1     1     1
        //2     4     8
        //3     9    27
        //4    16    64
        //5    25   125
        //6    36   216
        //7    49   343
        //8    64   512
        //9    81   729
        //10   100  1000    
        //BUILD SUCCESSFUL (total time: 0 seconds)

        //System.out.printf和System.out.format是相同的東西
        int n4 = 10;
        for (int i3 = 1; i3 <= n4; i3++) {
            System.out.format("%5d %5d %5d\n4", i3, i3 * i3, i3 * i3 * i3);
            //功能相同(printf和format是相同的東西)
            //printf的f就是format

            //run:
            //1     1     1
            //2     4     8
            //3     9    27
            //4    16    64
            //5    25   125
            //6    36   216
            //7    49   343
            //8    64   512
            //9    81   729
            //10   100  1000    
            //BUILD SUCCESSFUL (total time: 0 seconds)\
        }

        int n5 = 100;
        for (int i4 = 50; i4 <= n5; i4++) {
            double c = i4, f = 9.0 / 5 * c + 32;
            System.out.printf("%8.2f%8.2f/n5", c, f);
        }

        //上機測驗國際標準方式(擷取資料的方式，輸入單一資料)
        Scanner input = new Scanner(System.in);//System.in-->鍵盤
        System.out.println("input a string");
        String s3 = input.next();
        System.out.println("s = " + s3);
        System.out.println("input an integer: ");
        int n6 = input.nextInt();
        System.out.println("n = " + n6);
        System.out.println("input a float: ");
        double x = input.nextDouble();
        System.out.println("x = " + x);
        //run:
        //input a string
        //123
        //s = 123
        //input an integer: 
        //125
        //n = 125
        //input a float: 
        //20.0
        //x = 20.0
        //BUILD SUCCESSFUL (total time: 11 seconds)

        //輸入多筆資料，並切割為小字串
        //Scanner input = new Scanner(System.in);
        System.out.println("input a line: ");

        String s4 = input.nextLine();//整行輸入(包含空白)-->可以抓不只一個資料
        System.out.println("s = " + s4);

        String[] t = s4.split(" ");//分割大資料，利用空白(split)分割成小資料
        System.out.println("t = " + Arrays.toString(t));//t宣告為陣列

        //run:
        //input a line: 
        //1 2 3 4 5 0 6 
        //s = 1 2 3 4 5 0 6 
        //t = [1,  , 2,  , 3,  , 4,  , 5,  , 0,  , 6,  ]
        //BUILD SUCCESSFUL (total time: 5 seconds)
        //Scanner進多筆資料，並且切割為整數億或是浮點數
        //Scanner input = new Scanner(System.in);
        System.out.println("input two integers: ");
        String s5 = input.nextLine();
        System.out.println("s = " + s5);

        String[] t2 = s5.split(" ");
        int a8 = Integer.valueOf(t2[0]);//-->t[0]字串中的第一個資料
        //Integer.valueOf() --> 將資料(字串)轉為整數(int)
        //如果要用浮點數，可以用Double.valueOf()
        int b5 = Integer.valueOf(t2[1]);
        System.out.printf("a = %d,b=%d\n", a8, b5);

        //run:
        //input two integers: 
        //1 2
        //s = 1 2
        //a = 1,b=2
        //BUILD SUCCESSFUL (total time: 3 seconds)
        //run:
        //input two integers: 
        //   0 3(前面含有空白，會被誤認為分隔符號)
        //s =    0 3(第一個資料是空字串，第二筆資料是0，第三筆資料是3)
        //Exception in thread "main" java.lang.NumberFormatException: For input string: ""
        //at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //at java.lang.Integer.parseInt(Integer.java:592)
        //at java.lang.Integer.valueOf(Integer.java:766)
        //at javaapplication1.JavaApplication1.main(JavaApplication1.java:242)
        //Java Result: 1
        //BUILD SUCCESSFUL (total time: 11 seconds)
        //Scanner input = new Scanner(System.in);
        System.out.println("input integers: ");
        String[] s6 = input.nextLine().split(" ");

        int n7 = s6.length;
        int[] a9 = new int[n];
        for (int i2 = 0; i2 < n7; i2++) {
            a9[i2] = Integer.valueOf(s6[i2]);
        }
        System.out.println("a = " + Arrays.toString(a9));

        //run:
        //input integers: 
        //1 2 3 4 5
        //a = [1, 2, 3, 4, 5]
        //BUILD SUCCESSFUL (total time: 3 seconds)
        //簡易的輸入加總
        //Scanner input = new Scanner(System.in);
        String[] s7 = input.nextLine().split(" ");
        int k = Integer.valueOf(s7[0]);

        for (int j = 0; j < k; k++) {
            s7 = input.nextLine().split(" ");
            int a10 = Integer.valueOf(s7[0]);
            int b2 = Integer.valueOf(s7[1]);
            int sum = 0;
            for (int i3 = 0; i3 < b2; i3++) {
                sum += i3;
            }
            System.out.printf("sum(%d %d) = %d/n", a10, b2, sum);
        }

    }
}
