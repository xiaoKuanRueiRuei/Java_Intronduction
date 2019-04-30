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
        int a = 5, b = 2;
        System.out.println("a+b = " + (a + b));
        System.out.println("a-b = " + (a - b));
        System.out.println("a*b = " + (a * b));
        System.out.println("(double)a/b = " + ((double) a / b));
        /*(double)a/b 是先將a轉換h96ur4nj04
         不可以寫成(double)(a/b)如此成為先計算a/b才轉換*/
        System.out.println("a/b = " + (a / b));
        System.out.println("a%b = " + (a % b));
        System.out.println("a+b = " + (a + b));
        System.out.println("Math.pow(a,b) = " + (Math.pow(a, b)));
        System.out.println("a == b: " + (a == b));
        /* == 是不幸的歷史錯誤，當初只是工程師key錯哈哈*/
        System.out.println("a != b : " + (a != b));
        System.out.println("a>b :" + (a > b));
        System.out.println("a<b : " + (a < b));
        a += 1;
        System.out.println("a = " + a);
        a++;
        /*a++是a=a+1或a+=1的縮寫*/
        System.out.println("a=" + a + ",b=" + b);
        --b;
        /*--b是=b-1或-=1的縮寫*/
        System.out.println("a=" + a + ",b=" + b);
        a = b++;
        /*a=b++表示b的內容先拿出來運算，b是多少先放到a裡面去，意思就是a=b後，b再加一，所以就是a=5,b=2，先讓a=b，再讓b+1，所以a=2，b=3；
         ++b表示先讓b加一，再計算a=b，所以就是a=5,b=2，先讓b+1變成3，再讓a=b，所以a,b都是3*/
        System.out.println("a=" + a + ",b=" + b);
        a = ++b;
        System.out.println("a=" + a + ",b=" + b);
        /*加加減減請盡量不要用!!!因為非常難以理解!!!所以Python把++--的語法給拿掉了*/
        int c = 0, d = 1;
        c = ++c - --d;
        d = c++ + d--;
        System.out.println("c=" + c);
        System.out.println("d=" + d);

        int score = 85;
        String result;
        /*String表示字串，第一個字母是大寫是類別意*/
        if (score >= 60) {
            result = "pass";
        } else {
            result = "fail";
        }
        System.out.println("result = " + result);
        /*寫完才加;，是為了判別程式是否結束了，因為java不要求強制排版*/
 /*{}大括號表示一個程式的片段，如果沒有大括號，只能寫一行，所以需要加大括號，避免看錯*/
 /*在java中條件敘述必須加小括號()*/
    }

}
