/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

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
        
         //串列寫法
         double[] data = {8, 0.5, -21, 87, 23, -57};
         //double是傳統八個基本型態
         List<Double> a = new ArrayList<>();
         //Double是物件導向的類別
         //List是串列，是一種資料結構
         //<>表示現在只接受浮點數的資料
         //空的<>是因為前面已經寫了<Double>
         //List跟ArrayList一言難盡阿
         for (double x : data) {
         //這是for-each的寫法
         //要的是資料本身，和位置無關
         //x在data中
         a.add(x);
         //一個一個加到資料裡面來
         //將data中的x一個一個加到a中
         }
         System.out.println("data = " + a);
         //傳統陣列要加Array，不然印出地址
         //可是串列可以直接印
         System.out.println("min = " + Collections.min(a));
         System.out.println("max = " + Collections.max(a));
         //事先知道資料個數的用陣列(舊的資料結構，且Python沒有)，且固定(陣列改大小)
         //可是對機械內部而言，陣列因為固定所以比較好維護
         //反之(沒有限制資料個數)為串列(新的資料結構)
         //Java是新舊並陳
         //串列適合處理複查資料
         
         //基本排序 Bubble Sort 氣泡排序法
         //效率非常低
         //兩兩相鄰來比較再排序
         //第一輪跑完可以找出最大的(排到最後面)
         //最大值就好像氣泡慢慢上升一樣
         int[] a1 = {4, 8, 1, 7, 9, 6, 3, 10, 5, 2};
         System.out.println("Bobble_sort");
         System.out.println(Arrays.toString(a1));
         bubble_sort(a1);
         System.out.println(Arrays.toString(a1));
         
         //插入排序法 Insertion Sorｔ
         //將資料永遠分成兩部分
         //左邊是排好順序的資料
         //右邊是還沒排好順序的資料
         //剛開始可以將一個資料放左邊
         //或是左邊一個資料都沒有
         //把右邊的第一個資料拿出來跟左邊的資料比較大小
         //再插入適當的位子
         int[] b = {4, 8, 1, 7, 9, 6, 3, 10, 5, 2};
         System.out.println("Insertion_sort");
         System.out.println(Arrays.toString(b));
         insertion_sort(b);
         System.out.println(Arrays.toString(b));
         
         //選擇排序法 Selection Sort
         //選擇排序法的時間花在沒有排好順序的那邊
         //這是和插入排序法最不同的
         //在沒排好順序的地方找minima
         //找出右邊最小放到最左邊
         //將有邊最小的資料跟沒排好順序的位置交換
         int[] c = {4, 8, 1, 7, 9, 6, 3, 10, 5, 2};
         System.out.println("Selection_sort");
         System.out.println(Arrays.toString(c));
         selection_sort(c);
         System.out.println(Arrays.toString(c));
        
         //內建排序 Java Built-in Sort Metords 1
         //最快的方法
         int[]d = {4, 8, 1, 7, 9, 6, 3, 10, 5, 2};
         System.out.println("Java.Array.sort()");
         System.out.println(Arrays.toString(d));
         Arrays.sort(d);
         System.out.println(Arrays.toString(d));
         
        //串列的排序方法
        List<Integer> e = Arrays.asList(4, 8, 1, 7, 9, 6, 3, 10, 5, 2);
        //陣列轉換到串列裡
        //因為Arrays是陣列
        //Collections是串列
        //這兩個不相容
        System.out.println("Java.Collections.sort()");
        System.out.println(e);
        //因為串列可以直接印出來，所以不用用陣列的Arrays
        Collections.sort(e);
        System.out.println(e);
        //因為串列可以直接印出來，所以不用用陣列的Arrays
    }

    public static void bubble_sort(int[] a) {
        //void是空的意思
        //氣泡排序法的副程式
        //staric是靜態方法
        for (int i = 0; i < a.length - 1; i++) {
            //-1是因為要排序(個數-1)次
            for (int j = 0; j < a.length - 1 - i; j++) {
                //因為每做一個迴圈都要少一個
                if (a[j] < a[ j + 1]) {
                    int temp = a[j];
                    //temp is not a keyword, it is just a name for a local variable.
                    //You can call it temp, blub or better: entry or value 
                    //(to have a meaningful name for this variable).
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    //temp可以把它當一個位置即可
                }
            }
        }
    }

    static void insertion_sort(int[] b) {
        for (int i = 0; i < b.length; i++) {
            for (int j = i; j > 0 && b[j - 1] > b[j]; j--) {
                //因為左邊已經排順序了，所以左邊第一個是i
                //j>0是因為不可以跑過頭
                //因為程式不斷往前跑，所以j是減一
                int temp = b[j];
                b[j] = b[j - 1];
                b[j - 1] = temp;
            }
        }
    }

    static void selection_sort(int[] c) {
        int n = c.length;
        for (int i = 0; i < n - 1; i++) {
            //i代表沒排好資料的第一個位置
            int k = i;
            //k為i的位子
            for (int j = i + 1; j < n; j++) {
                if (c[j] < c[k]) {
                    k = j;
                    //k是紀錄沒排好資料的位子
                }
            }
            int temp = c[i];
            c[i] = c[k];
            c[k] = temp;
        }
    }
}
