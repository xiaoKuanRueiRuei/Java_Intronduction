
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
public class hw14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers : ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        int d = n1;
        for (int i = 0; i < n1; i++) {
            if (n2 % d != 0 || n1 % d != 0) {
                d -= 1;
            }
        }
        System.out.println("The GCD of " + n1 + " and " + n2 + " is " + d + ".");
    }
}
