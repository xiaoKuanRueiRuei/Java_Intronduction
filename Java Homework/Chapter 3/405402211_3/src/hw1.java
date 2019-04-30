
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
public class hw1 {

    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a , b , c :");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - (4 * a * c); //discriminant 判別式

        if (discriminant < 0) {
            System.out.println("The equation has no real roots.");
        } else {
            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            if (r1 == r2) {
                System.out.println("The equation has one root " + r1 + ".");

            } else {
                System.out.println("The equation has two roots " + r1 + " and " + r2 + ".");

            }

        }

    }

}
