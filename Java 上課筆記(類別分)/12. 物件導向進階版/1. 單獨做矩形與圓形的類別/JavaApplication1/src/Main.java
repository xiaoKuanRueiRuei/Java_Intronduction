/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Circle c = new Circle();
        System.out.println("c = " + c);

        c = new Circle(2.0);
        System.out.println("c = " + c);

        c = new Circle("red", 3.0);
        System.out.println("c = " + c);

        c = new Circle("blue", -4.0);
        System.out.println("c = " + c);

        Rectangle r = new Rectangle();
        System.out.println("r = " + r);

        r = new Rectangle(2, 3);
        System.out.println("r = " + r);

        r = new Rectangle(2, 1);
        System.out.println("r = " + r);

        r = new Rectangle("blue", 4, 5);
        System.out.println("r = " + r);
    }
}
