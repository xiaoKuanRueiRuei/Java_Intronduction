
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String[] s = input.nextLine().split(" ");
        int k = Integer.valueOf(s[0]);

        for (int j = 0; j < k; j++) {
            s = input.nextLine().split(" ");
            int n = s.length;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.valueOf(s[i]);
            }
            
            if(a[0]==a[1]&&a[1]==a[2]){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

}
