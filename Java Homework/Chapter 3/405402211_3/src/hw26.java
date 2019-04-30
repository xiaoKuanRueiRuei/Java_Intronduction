
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
public class hw26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int a = input.nextInt();
        if (a % 5 == 0 && a % 4 == 0) {
            System.out.println("Is " + a + "divisible by 4 and 5 ?" + "true");
        } else {
            System.out.println("Is " + a + "divisible by 4 and 5 ?" + "false");
        }
        if (a % 4 == 0 || a % 5 == 0) {
            System.out.println("Is " + a + "divisible by 4 or 5 ?" + "true");
        } else {
            System.out.println("Is " + a + "divisible by 4 or 5 ?" + "false");
        }
        if (a % 5 == 0 || a % 4 == 0) {
            if (a % 5 == 0 && a % 4 == 0) {
                System.out.println("Is " + a + "divisible by 4 or 5 , but not both ?" + "false");
            } else {
                System.out.println("Is " + a + "divisible by 4 or 5 , but not both ?" + "true");
            }
        }

    }
}
