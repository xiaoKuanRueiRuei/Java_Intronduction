
import java.util.Arrays;
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
        int n = 8;
        //8*8的棋盤
        int[] a = new int[n];
        //儲存空間(一維陣列)
        System.out.println("n = " + n);
        queens(n, 0, a);
        //n 個數 , 0 從0開始 , a 儲存的資料
    }

    static void queens(int n, int row, int[] a) {
        //row擺到第幾列
        for (int i = 0; i < row; i++) {
            a[row] = i;
            //在這一列，從第0行開始試試看
            if (check(row, a)) {
                if (row < n - 1) {
                    //n-1即最後一列
                    queens(n, row + 1, a);
                    //遞迴呼叫
                } else {
                    System.out.println(Arrays.toString(a));
                }
            }
        }
    }

    static boolean check(int row, int[] a) {
        for (int i = 0; i < row; i++) {
            if (a[row] == a[i] || Math.abs(a[row] - a[i]) == row - i) {
                return false;
            }
        }
        return true;
    }
}
