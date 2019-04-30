/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class hw20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance, Annual_Interest_Rate;
        System.out.println("Enter balance and interest rate (e.g., 3 for 3 %) :");
        balance = input.nextDouble();
        Annual_Interest_Rate = input.nextDouble();

        double interest = balance * (Annual_Interest_Rate / 1200);

        System.out.println("The interest is " + interest);
    }
}
