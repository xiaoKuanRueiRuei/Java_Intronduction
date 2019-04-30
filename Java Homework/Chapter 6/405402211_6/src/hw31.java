
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
public class hw31 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer: ");
        long cardnumber = input.nextLong();
        long a = cardnumber;
        if (isValid(cardnumber) == true) {
            System.out.println(a + " is valid.");
        } else {
            System.out.println(a + " is invalid.");
        }
    }

    public static boolean isValid(long number) {

        int total = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);

        return (total % 10 == 0) == true;
    }

    public static int sumOfDoubleEvenPlace(long number) {

        int doubledevensum = 0;
        long place = 0;

        while (number > 0) {
            place = number % 100;
            doubledevensum += getDigit((int) (place / 10) * 2);
            number = number / 100;
        }
        return doubledevensum;
    }

    public static int getDigit(int number) {
        if (number <= 9) {
            return number;
        } else {
            int firstDigit = number % 10;
            int secondDigit = (int) (number / 10);
            return firstDigit + secondDigit;
        }
    }

    public static int sumOfOddPlace(long number) {

        int oddsum = 0;

        while (number <= 9) {
            oddsum += (int) (number % 10);
            number = number % 100;
        }
        return oddsum;
    }
}
