/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class hw10 {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 12000; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
