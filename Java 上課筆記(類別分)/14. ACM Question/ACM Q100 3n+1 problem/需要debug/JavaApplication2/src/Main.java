
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
            System.out.format("%d %d %d\n",a,b,f(a,b));
        }
    }

    static int f(int n, int m) {
        int sum = 2 * Math.abs(m - n + 1);
        if (m < n) {
            for (int i = m; i < n; i++) {
                if (i > 1) {
                    if (i % 2 == 0) {
                        sum += 1;
                        i /= 2;
                    } else if (i % 2 != 0) {
                        sum += 1;
                        i = ((i * 3) + 1);
                    }
                } else {
                    System.out.println(sum);
                }
            }
        } else {
            for (int i = n; i < m; i++) {
                if (i > 1) {
                    if (i % 2 == 0) {
                        sum += 1;
                        i /= 2;
                    } else if (i % 2 != 0) {
                        sum += 1;
                        i = ((i * 3) + 1);
                    }
                } else {
                    System.out.println(sum);
                }
            }
        }
        return sum;
    }
}
