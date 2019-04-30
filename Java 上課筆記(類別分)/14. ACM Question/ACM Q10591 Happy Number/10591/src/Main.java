
import java.util.ArrayList;
import java.util.List;
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
        //ACM Q10591 Happy Numbers
        //http://luckycat.kshs.kh.edu.tw/homework/q10591.htm
        Scanner input = new Scanner(System.in);
        String[] s = input.nextLine().split(" ");
        int k = Integer.valueOf(s[0]);
        for (int j = 0; j < k; j++) {
            s = input.nextLine().split(" ");
            int n = Integer.valueOf(s[0]);
            System.out.format("Case #%d: %d", j + 1, n);

            if (f(n)) {
                System.out.println("is a Happy number.");
            } else {
                System.out.println("is an Unhappy number.");
            }
        }
    }

    static boolean f(int n) {
        List<Integer> a = new ArrayList<>();
        //可產生實體的是ArrayList
        //串列是一種新的資料結構，提供的功能相對於陣列較為完整
        //陣列缺少搜尋功能(僅提供二分搜尋法，要先排序)
        //需要將資料加入則使用串列
        while (n > 1 && !a.contains(n)) {
            //a.contains(n)：是否包含在a的串列中
            //!表示not
            a.add(n);
            n = next(n);
        }
        return n == 1;
        //如果n是1，表示n會重複出現
    }

    static int next(int n){//迭帶法
        int sum = 0;
        while (n > 10) {
            int a = n % 10;
            sum += a * a;
            n /= 10;
        }
        return sum;
        
        /*遞迴方法
        //在計算過程中，問題本質不變，只是資料變小，擇適合使用遞迴寫法
        static int next(int n){
        if (n == 0) {
            return 0;
        }
        int x = n % 10;
            return next(n/10) + x * x;
        */
    }
    /*
    run:
    3
    4
    Case #1: 4is an Unhappy number.
    7
    Case #2: 7is a Happy number.
    13
    Case #3: 13is a Happy number.
    BUILD SUCCESSFUL (total time: 5 seconds)
    */
}
