
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
        //ACM 11150 Cola
        //喝可樂為什麼這麼痛苦呢?
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        for (int i = 0; i < k; i++) {
            int a = input.nextInt();
            int ans = 0;
            if (a == 0) {
                ans = 0;
            } else if (a == 1) {
                ans = 1;
            } else if (a > 1) {
                if (a % 2 == 0) {
                    ans = (a / 2) * 3;
                } else if (a % 2 == 1) {
                    ans = (a / 2) * 3 + 1;
                }
            }
            System.out.println(ans);
        }
    }
}
