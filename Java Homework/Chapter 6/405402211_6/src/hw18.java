
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
public class hw18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String a = input.nextLine();
        boolean hasNumber = false;
        boolean hasLetter = false;

        int countNumber = 0;
        int countLetter = 0;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            int n = c;
            if (n >= 48 && n <= 57) {
                hasNumber = true;
                countNumber += 1;

            } else if (n >= 97 && n <= 122) {
                hasLetter = true;
                countLetter += 1;
            }
        }

        int x = a.length();
        if (x > 10 && countNumber >= 3 && countNumber + countLetter == x) {
            System.out.println("Valiid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}
