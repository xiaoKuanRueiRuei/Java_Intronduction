
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
        //ACM11150 cola
        //http://luckycat.kshs.kh.edu.tw/homework/q11150.htm
        //固定寫法，輸入測資
        /*每行單筆資料*/
        Scanner input = new Scanner(System.in);

        String[] s = input.nextLine().split(" ");/*傳回一陣列*/

        int k = Integer.valueOf(s[0]);/*因為鍵盤輸入就是字串，故需要轉型*/

 /*
        for (int i = 0; i < k; i++) {
            s = input.nextLine().split(" ");

            int n = Integer.valueOf(s[0]);
            for (int j = 0; j < n; j++) {
                System.out.println(s[j]);
            }
        }
         */
 /*鍵表法*/
        for (int i = 0; i < k; i++) {
            int MAX_N = 200;//因為已經給範圍了
            int[] a = build(MAX_N);//build就是將資料建立表格(陣列)
            s = input.nextLine().split(" ");
            int n = Integer.valueOf(s[0]);//沒有固定，要看題目
            for (int j = 0; j < n; j++) {
               // System.out.println(a[n]);
            }
            //System.out.println(n);
            /*
             run:
             4(有四筆資料)
             5(測資)
             8(測資)
             123(測資)
             200(測資)
             5(得到)
             8(得到)
             123(得到)
             200(得到)
             */

            //System.out.println(f(n));
            //System.out.println(cola(n));
        }
    }

    static int[] build(int n) {
        int[] a = new int[++n];//因為第一個數位置是0，所以n一開始就要+1
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i < n; i++) {
            a[i] = a[i - 2] + 3;
        }
        return a;
    }}
    /*
    static int f(int n) {
        if (n < 2) {
            return n;
        } else {
            return f(n - 2) + 3;
        }
    }
}
/*
     static int cola(int n) {
     if (n % 2 == 0) {
     n = n + (n / 2);
     } else {
     n = n + ((n - 1) / 2);
     }
     return n;
     }
     */
 /*如果個別去算要算很久，所以可以一次把他全部算出來然後去套，這樣反而比較快*/
