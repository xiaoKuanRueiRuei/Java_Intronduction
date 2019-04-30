
import static java.lang.System.in;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class hw12 {

    public static void main(String[] args) {
        // TODO code application logic herepublic static void main(String[] args) {
//AP(arithmetic progression，等差數列)
        Scanner input = new Scanner(System.in);
        double a1, d, n;
        System.out.println("Enter a1 , difference , and the number : "); //difference 是公差
        a1 = input.nextDouble();
        d = input.nextDouble();
        n = input.nextDouble();

        Double AP = a1 + (n - 1) * d;

        System.out.println("When a1 =" + a1 + " and difference = " + d + ",  a" + (int) (n) + " = " + AP);

    }

}
