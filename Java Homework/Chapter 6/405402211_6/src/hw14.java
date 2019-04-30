/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class hw14 {

    public static void main(String[] args) {
        double n = 0;
        double m = 0;
        System.out.println("i                      m(i)");
        System.out.println("_____________________________");
        for (int i = 1; i < 902; i++) {
            n = 4 * (Math.pow(-1, (i + 1)) / ((2 * i) - 1));
            m += n;
            if (i == 1 || i == 101 || i == 201 || i == 301 || i == 401 || i == 501
                    || i == 601 || i == 701 || i == 801 || i == 901) {
                System.out.printf("%-3d %25.4f\n", i, m);
            }
        }
    }
}
