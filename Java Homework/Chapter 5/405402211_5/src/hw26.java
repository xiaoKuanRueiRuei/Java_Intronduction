
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
public class hw26 {

    public static void main(String[] args) {
        double y = 1;
        double sum = 1;
        for (int j = 1; j <= 10; j++) {
            for (int i = 2; i < j * 10000; i++) {
                sum += y;
                y = y / i;
            }
            System.out.println("i = " + j * 10 + ",000" + " , e = " + sum);
        }
    }
}
