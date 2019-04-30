
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
public class hw16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int n = input.nextInt();
        System.out.println("");
        System.out.print("n = ");

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    System.out.print(i);
                    n /= i;
                    if (n >= 2) {
                        System.out.print("、");
                    }
                }
            }
        }
    }
}
