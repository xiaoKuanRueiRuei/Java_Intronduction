
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
public class hw21 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year : ( e.g. , 2012 ):");
        int year = input.nextInt();
        int y = year % 100;
        int c = year / 100;
        System.out.println("Enter month : (1-12) :");
        int m = input.nextInt();
        if (m == 1) {
            m += 12;
            y -= 1;
        } else if (m == 2) {
            m += 12;
            y -= 1;
        }
        System.out.println("Enter the day of the month : ( 1-31 ) :");
        int d = input.nextInt();

        int w = (y + (y / 4) + (c / 4) - (2 * c) + ((26 * (m + 1)) / 10) + d - 1) % 7;
        if (w == 0) {
            System.out.println("Day of the week is Sunday.");
        } else if (w == 1) {
            System.out.println("Day of the week is Monday.");
        } else if (w == 2) {
            System.out.println("Day of the week is Tuesday.");
        } else if (w == 3) {
            System.out.println("Day of the week is Wednesday.");
        } else if (w == 4) {
            System.out.println("Day of the week is Thursday.");
        } else if (w == 5) {
            System.out.println("Day of the week is Friday.");
        } else if (w == 6) {
            System.out.println("Day of the week is Saturday.");
        } else {
            System.out.println(w);
        }
    }
}
