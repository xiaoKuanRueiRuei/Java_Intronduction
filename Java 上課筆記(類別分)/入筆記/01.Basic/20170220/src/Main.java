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
        double a = 1.0, b = -3, c = 2;
        double d = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double x1 = (-b + d) / (2 * a);
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println(" x = " + x1 + " or " + x2);
    }

}
