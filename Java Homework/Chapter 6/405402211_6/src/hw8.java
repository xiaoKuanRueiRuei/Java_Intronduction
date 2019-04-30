

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ricky
 */
public class hw8 {

    public static void main(String[] args) {
        System.out.println("Miles     Kilometers     |     Kilometers     Miles");
        System.out.println("_____________________________________________________");
        for (int i = 0; i <= 9; i++) {
            System.out.printf("%-2d %12.3f          |%7d %18.3f\n", (i + 1), mileTokilometer(i + 1), (20 + (5 * i)), kilometerTomile(20 + (5 * i)));
        }
    }

    public static double mileTokilometer(double mile) {
        double kilometer = 1.609 * mile;
        return kilometer;
    }

    public static double kilometerTomile(double kilometer) {
        double mile = (1 / 1.609) * kilometer;
        return mile;
    }
}
