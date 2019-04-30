
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ricky
 */
public class hw3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, d, e, f;
        System.out.println("Enter  a, b, c, d, e, f :");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();

        if (a * d - b * c == 0) {
            System.out.println("The equation has no solution.");
        } else {

            double w = ((a * d) - (b * c));
            double x = ((e * d) - (b * f)) / w;
            double y = ((a * f) - (e * c)) / w;

            System.out.println("x is " + x + " y is " + y);

        }

    }
}
