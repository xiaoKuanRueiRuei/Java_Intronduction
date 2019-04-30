
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
public class hw18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight of your package (with pounds) :");

        double weight = input.nextDouble();
        if (0 < weight) {
            if (weight <= 2) {
                System.out.println("Your shipping fee are 2.5 dollars.");
            } else if (weight <= 4) {
                System.out.println("Your shipping fee are 4.5 dollars.");
            } else if (weight <= 10) {
                System.out.println("Your shipping fee are 7.5 dollars.");
            } else if (weight <= 20) {
                System.out.println("Your shipping fee are 10.5 dollars.");
            } else {
                System.out.println("The package cannot be shipped.");
            }
        } else {
            System.out.println("Error.");
        }
    }
}
