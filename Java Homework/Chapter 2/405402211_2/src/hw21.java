/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class hw21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double InvestmentAmount;
        System.out.println("Enter investment amount:");
        InvestmentAmount = input.nextDouble();

        double Annual_Interest_Rate_in_Percentage;
        System.out.println("Enter annual interest rate in percentage:");
        Annual_Interest_Rate_in_Percentage = input.nextDouble();

        double NumberOfYears;
        System.out.println("Enter number of years:");
        NumberOfYears = input.nextDouble();

        double FutureInvestmentValue = InvestmentAmount * Math.pow(1 + (Annual_Interest_Rate_in_Percentage / 1200), NumberOfYears * 12);

        System.out.println("Accumulated value is $ " + FutureInvestmentValue);
    }
}
