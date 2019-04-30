/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author user
 */
public class JavaApplication1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Java 1.8版新功能

//Stream 串流
        int n = 0;

        //有規律資料的串流
        int sum = IntStream.range(1, n + 1).sum();
        /*IntStream-->整數串流
         range(1,1+n)-->有頭沒有尾，1~n的意思
         DoubleStream裡面是沒有range的*/
        System.out.println("sum = " + sum);
        System.out.println("length = " + n);

        OptionalDouble x = IntStream.rangeClosed(1, n).average();
        /*Optional + 型態-->這個形態的資料裡面可能沒有資料
         -->否則平均十分母為零
         -->如果不加Optional，編譯不會過(因為有用到average)
         rangeClosed-->範圍封閉，有頭有尾，意思和range其實是一樣的
         */
        double average = x.isPresent() ? x.getAsDouble() : 0;
        /*判定Optional裡面是否有資料*/
        /*
         當int n = 0時，我們可以得到下列結果：
         sum = 0
         length = 0
         average = 0.0
         */
        System.out.println("average = " + average);

        //沒規律資料(陣列資料)的串流
        int[] a = {12, 1, 9, 6, 12, 19, 6, 5, 11, 7, 12};

        int sum1 = Arrays.stream(a).sum();
        /*Arrays.stream-->是將陣列資料視為串流(轉接頭的概念)*/
        System.out.println("sum = " + sum1);
        System.out.println("length = " + a.length);

        OptionalDouble x1 = Arrays.stream(a).average();
        double average1 = x1.isPresent() ? x1.getAsDouble() : 0;
        System.out.println("average = " + average1);
        /*
         sum = 100
         length = 11
         average = 9.090909090909092
         */
        System.out.println("a = " + Arrays.toString(a));

        int min = Arrays.stream(a).min().getAsInt();
        System.out.println("min = " + min);

        int Max = Arrays.stream(a).max().getAsInt();
        System.out.println("Max = " + Max);
        /*
         a = [12, 1, 9, 6, 12, 19, 6, 5, 11, 7, 12]
         min = 1
         Max = 19
         */
        //串流轉回陣列
        int[] a1 = {12, 19, 6, 12, 19, 6, 5, 11, 7, 12};
        System.out.println("a = " + Arrays.toString(a1));

        int[] b = Arrays.stream(a).sorted().toArray();
        System.out.println("b = " + Arrays.toString(b));
        /*
         先將陣列a1轉為串流，再將串流轉回陣列b(途中進行運算)
         a = [12, 19, 6, 12, 19, 6, 5, 11, 7, 12]
         b = [1, 5, 6, 6, 7, 9, 11, 12, 12, 12, 19]
         */
        //串列與串流的交流
        List<Integer> a2 = Stream.of(12, 19, 6, 12, 19, 6, 5, 11, 7, 12).collect(Collectors.toList());
        //串流轉串列的寫法(   .collect(Collectors.toList())   )
        System.out.println("a = " + a2);

        int x2 = 12;
        int y = Collections.frequency(a2, x2);
        /*frequency --> 計算資料出現頻率(次數)
         a2是所有資料，x2是單一資料
         求x2在a2資料中所出現的頻率(次數)
         */
        System.out.println("frequency of " + x2 + " = " + y);
        /*
         a = [12, 19, 6, 12, 19, 6, 5, 11, 7, 12]
         frequency of 12 = 3
         */

        //Map(對應、對照) Method
        List<Integer> a3 = IntStream.range(1, 11).boxed().collect(Collectors.toList());
        /*
         int 是基本型態，Integer是類別(類別要求大寫)
         boxed()封裝，將基本的整數型態(int)轉換為整數類別(Integer)
         因為串列所接受的是類別型態(Integer, Double, etc.)不是基本型態(int, double, etc.)
         */
        System.out.println("a = " + a3);

        List<Integer> b2 = a3.stream().map(x3 -> 3 * x3 + 1).collect(Collectors.toList());
        /*
         .map(x3 -> 3 * x3 + 1)
         這寫法非常重要
         "->"他就是箭頭不要懷疑
         左邊x3是domain
         可以把他想成
         f(x3) = 3 * x3 + 1
         x3本身沒有任何意義，只是一個暫時性的東西(暫時的，假的，眼睛業障重阿)
         x3就是Python中的lambda Function(無須訂名字用完即丟的函數)
         */
        System.out.println("b = " + b2);
        /*
         a = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
         b = [4, 7, 10, 13, 16, 19, 22, 25, 28, 31]
         */
        //Filter過濾器
        List<Integer> b3 = a3.stream().filter(x3 -> x3 % 3 == 0).collect(Collectors.toList());
        System.out.println("b = " + b3);
        /*
         b = [3, 6, 9]
         */
        List<Integer> c = a3.stream().filter(x3 -> x3 < 5).collect(Collectors.toList());
        System.out.println("c = " + c);
        /*
         c = []
        -->篩選後是有可能出現空資料的
         */
    }

}
