
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
        System.out.println("Please enter ten numbers : ");
        double[] a = new double[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextDouble();
        }
        System.out.println("The maximmum number is " + max(a));
    }

    public static double max(double[] array) {
        double maximmum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximmum) {
                maximmum = array[i];
            }
        }
        return maximmum;
    }
}
