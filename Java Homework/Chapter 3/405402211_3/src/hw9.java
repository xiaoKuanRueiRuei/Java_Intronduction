
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
public class hw9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer :");

        String[] s = input.nextLine().trim().split(" ");
        int a = Integer.valueOf(s[0]);

        int d9 = a % 10;
        int d8 = (a / 10) % 10;
        int d7 = (a / 100) % 10;
        int d6 = (a / 1000) % 10;
        int d5 = (a / 10000) % 10;
        int d4 = (a / 100000) % 10;
        int d3 = (a / 1000000) % 10;
        int d2 = (a / 10000000) % 10;
        int d1 = (a / 100000000) % 10;

        int d10 = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11;
        if (d10 != 10) {
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
        } else if (d10 == 10) {
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
        }

    }
}
