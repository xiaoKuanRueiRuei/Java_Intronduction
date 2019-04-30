
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
public class hw45 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        double n4 = input.nextDouble();
        double n5 = input.nextDouble();
        double n6 = input.nextDouble();
        double n7 = input.nextDouble();
        double n8 = input.nextDouble();
        double n9 = input.nextDouble();
        double n10 = input.nextDouble();

        double mean = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10) / 10;
        System.out.println("The mean is " + mean);

        double z = n1 * n1 + n2 * n2 + n3 * n3 + n4 * n4 + n5 * n5 + n6 * n6 + n7 * n7 + n8 * n8 + n9 * n9 + n10 * n10;
        double deviation = Math.sqrt((z - (mean * mean / 10)) / 9);
        System.out.println("The standard deviation is " + deviation);
    }
}
