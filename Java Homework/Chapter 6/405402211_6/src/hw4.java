
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
public class hw4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers : ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.println(gcd(n1, n2));
    }

    public static int gcd(int num1, int num2) {
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int d = num1;
        for (int i = 0; i < num1; i++) {
            if (num2 % d != 0 || num1 % d != 0) {
                d -= 1;
            }
        }
        return d;
    }
}
