
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class hw19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1, y1, x2, y2, x3, y3;
        System.out.println("Enter three points for a triangle:");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        double side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double side2 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double side3 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double HalfSumSides = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(HalfSumSides * (HalfSumSides - side1) * (HalfSumSides - side2) * (HalfSumSides - side3));
        System.out.println("The area of the triangle is " + area);
    }
}
