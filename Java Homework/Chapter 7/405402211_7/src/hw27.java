
import java.util.Arrays;
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
public class hw27 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] list1 = new int[6];
        int[] list2 = new int[6];
        System.out.printf("Enter list1 : ");
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        System.out.printf("Enter list2 : ");
        for (int i2 = 0; i2 < list2.length; i2++) {
            list2[i2] = input.nextInt();
        }
        if (equals(list1, list2)) {
            System.out.println("Two lists are identical");
        } else {
            System.out.println("Two list are not identical ");
        }

    }

    public static boolean equals(int[] list1, int[] list2) {
        Arrays.sort(list1);
        Arrays.sort(list2);
        int flag = 0;
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                flag += 1;
            }
        }
        if (flag == 0) {
            return true;
        } else {
            return false;
        }
    }
}
