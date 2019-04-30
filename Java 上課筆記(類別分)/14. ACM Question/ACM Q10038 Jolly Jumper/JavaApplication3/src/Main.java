
import java.util.Arrays;
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
        //ACM 10038 Jolly Jumpers
        //http://luckycat.kshs.kh.edu.tw/homework/q10038.htm
        /*每行多筆資料*/
        Scanner input = new Scanner(System.in);
        String[] s = input.nextLine().split(" ");
        int k = Integer.valueOf(s[0]);

        for (int i = 0; i < k; i++) {
            s = input.nextLine().split(" ");

            int n = s.length;/*每組測資資料個數*/

            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = Integer.valueOf(s[j]);
            }
            if (f(a)) {
                System.out.println("Jolly");
            } else {
                System.out.println("Not Jolly");
            }
        }
    }

    static boolean f(int[] a) {
        int n = a.length;
        if (n <= 1) {
            return true;/*因為只有一個數字，沒有間隔，所以就是Jolly Jumpers*/

        }
        int[] b = new int[--n];/*因為間隔應該是個數減一*/

        for (int i = 0; i < n; i++) {
            b[i] = Math.abs(a[i + 1] - a[i]);/*因為間距都是正的*/

        }
        Arrays.sort(b);/*排序，讓它變成有順序的才能辨別*/

        for (int i = 0; i < n; i++) {
            if (b[i] != i + 1) {
                return false;
            }
        }
        return true;
    }
}
