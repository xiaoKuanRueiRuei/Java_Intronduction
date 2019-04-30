
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Basic
        int a = 3, b = 5;
        System.out.println(a % 3 == 0);
        System.out.println(b % 3 == 0);
        System.out.println(a % 3 == 0 && b % 3 == 0);
        System.out.println(a % 3 == 0 || b % 3 == 0);

        // Do-while Loop
        //當i=1，n=0時，這明顯是錯誤的，可是在do-while中邏輯是正確的，所以先做，在do-while中至少會做一次
        //相對的，while是先判斷才做，所以運用while寫法時，程式不會跑
        int s = 0;
        int n = 0;
        int i = 1;
        do {
            s += i;
            i += 1;
        } while (i <= n);

        System.out.println("s =" + s);

        // Do-while loop實例
        //Scanner屬於外部套件，需要使用import指令
        //找不到Sacnner，使用滑鼠右鍵的Fix import
        //Netbeans會自動幫你找
        //找到專案最上面，可以看到電腦自動幫你import了
        //在下方Output介面中直接輸入即可測試
        //輸入完畢後，記得按Enter
        //在遊戲中之所以不用案Enter，是因為那些遊戲中有多寫一個專案，控制鍵盤
        //輸入Q即可跳脫迴圈
        Scanner input = new Scanner(System.in);
        char key;
        do {
            key = input.next().toUpperCase().charAt(0);
            switch (key) {
                case 'Q':
                    System.out.println("Quit");
                    break;
                case 'W':
                case 'S':
                case 'A':
                case 'D':
                    System.out.println("Move");
                    break;
                case 'H':
                    System.out.println("Help");
                    break;
            }

        } while (key != 'Q');

        //Number of times the integer 2 occurs in an integer n (因數分解) (Loops)
        int n2 = 360;
        int count = 0;
        while (n2 % 2 == 0) {
            n2 /= 2;
            count += 1;
        }
        System.out.println("count =" + count);

        //迴圈小常識.1
        int n3 = 10;
        for (int i2 = 1; i2 <= n3; i2++) {
            System.out.println(i2);
            n = 5;
        }

        //迴圈小常識.2
        int n4 = 10;
        for (int i3 = 1; i3 <= n4; i3++) {
            System.out.println("Hello");
        }

        //Empty Loop
        int n5 = 10;
        for (int i4 = 1; i4 <= n5; i4++);
        System.out.println("Hello");
        //下面的Hello跟迴圈無關

        //Java陣列資料(視為群體比一個一個單筆資料方便許多)
        int[] a1 = {2, 1, 5, 9, 3};
        int n6 = a1.length;
        //length 是指個數
        for (int i5 = 0; i5 < n6; i5++) {
            System.out.println("a[" + i5 + "]=" + a1[i]);
        }
        System.out.println("a[n-1]=" + a1[n6 - 1]);
        System.out.println("a[n-2]=" + a1[n6 - 2]);
        //n是指位子

        //資料是先無法確定抑或是大數據時可使用下列程式(物件導向資料)
        //先知道資料個數
        int n7 = 100;
        //[]屬於型態，可是如果放在變數a後面，也是對的，可是盡量不要用
        int[] a2 = new int[n7];
        for (int i6 = 0; i6 < n7; i6++) {
            System.out.println("a[" + i6 + "]=" + a2[i6]);
        }
        //不要依賴程式語言內定資料
        //換一個電腦，換一個平台，初值不一定一樣

        //
        //for + Tab是for-loop的快捷鍵
        int n8 = 100;
        int[] a3 = new int[n8];
        for (int i7 = 0; i7 < 100; i7++) {
            a3[i7] = i7 + 1;
        }

        for (int i7 = 0; i7 < n; i7++) {
            System.out.println("a[" + i7 + "]=" + a3[i7]);
        }

        //如何將需要的資料塞進去
        //如何將資料加總
        int n9 = 100;
        int[] a4 = new int[n9];

        for (int i8 = 0; i8 < n9; i8++) {
            a4[i8] = i8 + 1;
        }
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum += a4[j];
        }

        System.out.println("sum = " + sum);

        //For-Each
        int n10 = 100;
        int[] a5 = new int[n10];

        for (int i9 = 0; i9 < n10; i9++) {
            a5[i9] = i9 + 1;

        }
        int sum1 = 0;
        for (int x : a5) {
            sum1 += x;
        }

        System.out.println("sum = " + sum1);

    }
}
