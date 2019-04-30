
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
        for (int i = 0; i < k; i++) {
            s = input.nextLine().split(" ");
            int a = Integer.valueOf(s[0]);
            int b = Integer.valueOf(s[1]);
            int max_cycle_len = 0;
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            for (int j = a; j <= b; j++) {
                int t = f(j);
                if (max_cycle_len < t) {
                    max_cycle_len = t;
                }
            }
            System.out.format("%d %d %d\n", a, b, max_cycle_len);
        }
    }

    static int f(int n) {
        int k = 1;
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = ((n * 3) + 1);
            }
            k++;
        }
        return k;
    }
}
