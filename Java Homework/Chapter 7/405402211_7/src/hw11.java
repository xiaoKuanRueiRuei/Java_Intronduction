
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
public class hw11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter ten numbers : ");
        double[] a = new double[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextDouble();
        }
        System.out.printf("The mean is  %.2f\n", mean(a));
        System.out.printf("The standard deviation is  %.5f\n", deviation(a));
    }

    public static double deviation(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += Math.pow(x[i] - mean(x), 2);
        }
        double deviation = Math.sqrt(sum / (x.length - 1));
        return deviation;
    }

    public static double mean(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        double mean = sum / x.length;
        return mean;
    }
}
