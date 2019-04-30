/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class hw4 {

    public static void main(String[] args) {

        System.out.println("Inches   Centimetres");
        for (int i = 1; i <= 10; i++) {
            int Inches = 1 * i;
            double Centimetres = Inches * 2.54;
            if (Inches < 10) {
                System.out.printf("%-1d %18.1f\n", Inches, Centimetres);
            } else {
                System.out.printf("%-1d %17.1f\n", Inches, Centimetres);
            }

        }
    }
}
