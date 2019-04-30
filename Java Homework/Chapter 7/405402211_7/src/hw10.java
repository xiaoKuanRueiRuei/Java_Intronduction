
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author David
 */
public class hw10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter ten numbers :");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();

        }
        double max = indexofLargestElement(array);
        System.out.println("The index of largest element is :" + max);

    }

    public static int indexofLargestElement(int[] array) {
        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }

        }
        return index;

    }

}
