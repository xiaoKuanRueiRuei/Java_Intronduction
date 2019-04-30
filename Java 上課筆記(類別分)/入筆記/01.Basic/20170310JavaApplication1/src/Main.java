
import static com.sun.javafx.Utils.sum;
import static java.lang.Double.sum;
import static java.lang.Float.sum;
import static java.lang.Integer.sum;
import static java.lang.Long.sum;
import java.util.Arrays;
import java.util.Random;
import static javax.swing.Spring.sum;

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

        //Basic(舊式寫法)
        int i = 2;
        int j = (i = 3) * i;
        System.out.println(j);

        int a = 9;
        a += (a = 3);
        System.out.println(a);

        int b = 9;
        b = b + (b = 3);
        System.out.println(b);

        //Basic if / else(舊式寫法)
        int a1 = 0;
        if (a1 == 0) {

            //C語言系列最大的漏洞即為運算中改變變數的設定
            //= (設定) 及 == (等於) 容易被誤用
            //因此不建議使用
            //C語言中，當變數為0時，設定為錯誤
            //但當使用JAVA時，條件判斷不允許使用整數
            //僅能使用布林值(True or False)-->JAVA的安全措施
            System.out.println("YES");
        } else {
            System.out.println("NO");

            //Formatting is important!!!
            //Conditional --  < , >
            int a2 = 1, b2 = 2;
            int max = a2 > b2 ? a2 : b2;
            System.out.println(max);
            //條件放前面，條件成立則是第一個(a)，條件不成立放第二個(b)
            //問號只是隔開的符號

            //Conditional -- abs
            int a3 = -1;
            int abs = (a3 >= 0) ? a3 : -a3;
            System.out.println(abs);

            //陣列，C語言沒有陣列長度
            int[] a4 = {2, 1, 5, 9, 3};
            int n = a4.length; //長度(陣列中的位子)
            for (int i2 = 0; i2 < n; i2++) {
                System.out.println("a[" + i2 + "]=" + a4[i2]);
            }

            System.out.println("a[n-1]=" + a4[n - 1]);
            //Python 引入負的index，可是在JAVA中，只能用原來位子去減
            //JAVA中是沒有從哪到哪（：）的用法
            System.out.println("a[n-2]=" + a4[n - 2]);

            //JAVA Aarry
            //JAVA陣列必須先知道大小，且不可以改變，
            int n2 = 10;
            int[] a5 = new int[n2]; //浮點數陣列則在後面宣告double
            //陣列宣告必須使用new

            for (int i4 = 0; i4 < n2; i4++) {
                a5[i4] = i4 + 1;
            }
            System.out.println("a = " + Arrays.toString(a5));

            int sum = 0;
            for (int i5 = 0; i5 < n2; i5++) {
                sum += a5[i5];
            }

            System.out.println("sum = " + sum);

            //run:(正確的輸出樣式)
            //a = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
            //sum = 55
            //BUILD SUCCESSFUL (total time: 0 seconds)
            //JAVA Aarry
            int n3 = 10;
            int[] a6 = new int[n3];

            for (int i6 = 0; i6 < n3; i6++) {
                a6[i6] = i6 + 1;
            }
            System.out.println("a = " + a6);
            //run:(輸出結果)
            //a = [I@15db9742  (記憶體位子，因為A是一個陣列，型態為參考位子，因此輸出的是陣列在記憶體中的參考位子)
            //sum = 55
            //BUILD SUCCESSFUL (total time: 0 seconds)

            int sum2 = 0;
            for (int i7 = 0; i7 < n3; i7++) {
                sum += a6[i7];
            }

            System.out.println("sum = " + sum2);

            //goto被JAVA保留，不再供人使用
            //如何產生隨機亂數
            Random rnd = new Random(); //rnd = random number
            int n4 = 10;
            int[] a8 = new int[n4]; //產生複數資料，須使用陣列
            for (int i8 = 0; i8 < n4; i8++) {
                a8[i8] = rnd.nextInt(100);  // 0~99 (100個整數中隨機挑選)
            }
            System.out.println("a = " + Arrays.toString(a8));
            //run:
            //a = [81, 14, 49, 0, 36, 1, 9, 9, 91, 85]
            //BUILD SUCCESSFUL (total time: 0 seconds)

            //擲骰子
            //Random rnd = new Random();
            int n5 = 10;
            int[] a9 = new int[n5];
            for (int i9 = 0; i9 < n5; i9++) {
                a9[i9] = rnd.nextInt(6) + 1;
            }
            System.out.println("a = " + Arrays.toString(a9));

            //兩粒骰子加總
            //Random rnd = new Random();
            int n6 = 10;
            int[] a10 = new int[n6];
            for (int i10 = 0; i10 < n6; i10++) {
                int b3 = rnd.nextInt(6) + 1;
                int c = rnd.nextInt(6) + 1;
                a10[i10] = b3 + c;
            }

            System.out.println("a = " + Arrays.toString(a10));

        }
    }
}
