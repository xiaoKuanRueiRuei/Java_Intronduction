/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class hw13 {

    public static void main(String[] args) {
        System.out.println("I                  m(i)");
        System.out.println("________________________________");
        double n = 0;
        double m = 0;
        for (int i = 1; i <= 20; i++) {
            n = i / (i + 2.0);
            m += n;
            System.out.printf("%-2d %22.4f\n", i, m);
        }

    }
}
