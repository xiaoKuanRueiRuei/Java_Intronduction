/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ACM10038 Jolly Jumper       
        //整數並不代表正負
        Scanner input = new Scanner(System.in);
        //主程式僅為系統與使用者之間的介面
        //副程式才是真正在運作的
        //鍵盤輸入永遠是字串
        String[] s = input.nextLine().trim().split(" ");
        //較少出錯，整行抓進來
        //spilt傳回是一個字串陣列
        //trim是將前面的空白拿掉
        int k = Integer.valueOf(s[0]);
        //Integer要大寫!!!

        //抓出測資個數
        for (int j = 0; j < k; j++) {
            s = input.nextLine().trim().split(" ");
            //將不定個數的測資抓進來，可是是字串
            int n = s.length;
            //n就是s陣列的長度(個數)
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.valueOf(s[i]);
            }
            if (f(a)) //因為已經判斷出是布林值了
            //所以不用寫f(a)==true
            //這樣多此一舉，可是是對的
            {
                System.out.println("Joliy");
            } else {
                System.out.println("Not Joliy");
            }
        }
    }

    static boolean f(int[] a) {
        //因為要傳回Yes/True，所以型態為boolean
        //題目說將數字數量為一個，就視為Jolly Number
        //主程式傳回的是參數(陣列a)
        //三個以上的資料就視為陣列
        int n = a.length;
        if (n <= 1) {
            return true;
            //資料數量(個數)用leanth
        }
        //因為else就錯誤了，所以可以省略

        //a裡面有n個，b裡面有n-1個
        int[] b = new int[--n];
        //先減一才放n(表示b有-1+n個資料)
        //如果寫n--，這樣變成b有n個，再減一
        //n-1個間隔，因為是多數，所以用陣列

        //Java是將資料一個一個丟進去
        for (int i = 0; i < n; i++) {
            //算出間隔數字再填入
            //b0放a0-a1的絕對值
            b[i] = Math.abs(a[i + 1] - a[i]);
        }
        //for迴圈的範圍要注意，這一個for迴圈僅負責算出間隔
        //abs是絕對值
        Arrays.sort(b);
        //排序是重要的

        for (int c = 0; c < n; c++) {
            if (b[c] != c + 1) {
                return false;
            }
        }
        return true;

    }
}