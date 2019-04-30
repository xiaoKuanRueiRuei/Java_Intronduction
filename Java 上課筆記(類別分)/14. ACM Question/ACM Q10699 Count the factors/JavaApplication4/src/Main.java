
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
        Scanner input = new Scanner(System.in);
        String[] s = input.nextLine().split(" ");
        int k = Integer.valueOf(s[0]);
        int MAX_N = 1000000;
        boolean[] a = build(MAX_N);
        for (int j = 0; j < k; j++) {
            s = input.nextLine().split(" ");
            int n = Integer.valueOf(s[0]);
            System.out.format("%d：%d\n",n, f(n,a));
        }
    }

    //只要碰到質數問題
    //先建質數表
    //簡易建立質數表
    static boolean[] build(int n) {
        boolean[] a = new boolean[++n];//陣列各數少一個，所以先將n+1，如此才可以避免0的問題
        Arrays.fill(a, true);//a裡面全部都初值為true

        for (int i = 2; i * i < n; i++) {
            //只要找到根號n即可
            if (a[i]) {
                for (int j = i*i; j < n; j+=i) {
                    a[j] = false;
                    //只要找到質數，後面的倍數全部都可以刪除了
                }
            }
        }
        return a;
    }

    static int f(int n, boolean[] a) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (a[i] && n % i == 0) {
                count += 1;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        return count;
    }
}
