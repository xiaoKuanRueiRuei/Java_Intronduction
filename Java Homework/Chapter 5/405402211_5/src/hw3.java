
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
public class hw3 {

    public static void main(String[] args) {

        System.out.println("Celsius   Fahrenheit");
        for (int j = 0; j <= 50; j++) {
            int Celsius = j * 2;
            double Fahrenheit = Celsius * (9.0 / 5.0) + 32;
            if (Celsius < 10) {
                System.out.printf("%-1d %18.1f\n", Celsius, Fahrenheit);
            } else if (Celsius < 100) {
                System.out.printf("%-1d %17.1f\n", Celsius, Fahrenheit);
            } else {
                System.out.printf("%-1d %16.1f\n", Celsius, Fahrenheit);
            }

        }
    }
    
       

    }
