
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
        //ACM 11000 Bee
        //http://luckycat.kshs.kh.edu.tw/homework/q11000.htm
        //邏輯
        //第二年雌 = 1 + 第一年雄
        //第二年雄 = 第一年雌 + 第一年雄-->費氏數列
        //第一年總數 = 第二年雄
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
        }
    }
    static void f(int n){
        long female = 1,male = 0;
        
        for (int i = 1; i <= n; i++) {
            long t = female;
            female = male+1;
            male+=t;
        }System.out.format("%d %d",male,);
    }
}
