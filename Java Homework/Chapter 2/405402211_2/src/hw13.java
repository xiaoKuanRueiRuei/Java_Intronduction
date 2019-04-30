/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author ricky
 */
public class hw13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount:");
        double MonthlySavingAmount = input.nextDouble();

        double M1 = MonthlySavingAmount * (1 + 0.003125);
        double M2 = (MonthlySavingAmount + M1) * (1 + 0.003125);
        double M3 = (MonthlySavingAmount + M2) * (1 + 0.003125);
        double M4 = (MonthlySavingAmount + M3) * (1 + 0.003125);
        double M5 = (MonthlySavingAmount + M4) * (1 + 0.003125);
        double M6 = (MonthlySavingAmount + M5) * (1 + 0.003125);

        System.out.println("After the first month , the account value is  " + M1);
        System.out.println("After the second month , the account value is  " + M2);
        System.out.println("After the third month , the account value is  " + M3);
        System.out.println("After the forth month , the account value is  " + M4);
        System.out.println("After the fifth month , the account value is  " + M5);
        System.out.println("After the sixth month , the account value is  " + M6);

    }
}
