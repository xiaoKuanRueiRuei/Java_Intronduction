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
        //Basic 1
        int score = 85;
        String result;//在Java中所使用的任何變數都必須事先定義
        if (score >= 60) {
            result = "pass";
        } else {
            result = "faul";
        }
        System.out.println("result = " + result);

        //Basic 2 (If、else)
        String 身分證字號 = "A12345****";
        String 性別;
        if (身分證字號.charAt(1) == '1') {
            //字串(A12345****，是物件，點(.)是逗點意char(字元型態)At表示是有順序中資料意，所以charAt(1)表示是第二個位置)
            //'1'用單引號是因為是字元(只有一個字)
            性別 = "男性";
        } else {
            性別 = "女性";
        }
        System.out.println("性別 = " + 性別);

        //Basic 3 (BMI)
        double BMI = 21;
        String status;
        if (BMI < 18.5) {
            status = "體重過輕";
        } else if (BMI < 24) {
            //這邊的else是對前面(第一個)的if
            status = "正常範圍";
        } else {
            //這邊的else是配合第二個if
            status = "過重";
        }

        //Basic 4.1 (switch case)
        char grade = 'Z';
        switch (grade) {

            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'C':
                System.out.println("Well down!");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                //default是指 以上皆非，相當於else的意思
                System.out.println("Invail grade");
                break;
        }
        System.out.println("Your grade is " + grade);

        //Basic 5.1 (for、while Loop) --> 不要用
        //Java的整數範圍是有範圍的，到2的31次方減1(int)
        //當超過範圍時會出現bug
        int s = 0;
        int n = 10000;
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        System.out.println("s = " + s);

        //Basic 5.2 (for、while Loop，這是Python中的sum()指令) --> 不要用
        //Java的整數範圍是有範圍的，到2的63次方減1(long)
        //當超過範圍時會出現bug
        long t = 0;
        int m = 1000000000;
        for (int i = 1; i <= m; i++) {
            t += i;
        }
        System.out.println("t = " + t);

        //Basic 5.3 (for loop，基數總和)
        long u = 0;
        int o = 3;
        for (int i = 1; i <= o; i += 2) {
            u += i;
        }
        System.out.println("u = " + u);

        //Basic 5.4 (for loop，偶數總和)
        long v = 0;
        int q = 6;
        for (int i = 2; i <= q; i += 2) {
            v += i;
        }
        System.out.println("v = " + v);

        //Basic 5.5 (for loop，偶數總和)
        long w = 0;
        int e = 6;
        int i = 1;
        for (; i <= e; i += 2) {
            //此時括號中第一個分號不可以省略
            //當作是空指令
            //因為指令已經出現在前面了(int i = 1)
            w += i;
        }
        System.out.println("w = " + w);

        //Basic 5.6(舊式寫法)
        String[] languages = {"C", "C++", "PHP", "Java", "Python"};
        for ( int h =0 ;h <languages.length; h++) {
            System.out.println(languages[h]);
        }
        //Basic 5.7(Python 中的for-each loop，C++中出現的)
        String[] languages1 = {"C", "C++", "PHP", "Java", "Python"};
        //將有順序的資料中一個一個的拿出來
        for (String x : languages1) {
            System.out.println(x);
        }
    
        //Basic 5.8(Python 中的for-each loop，C++中出現的)
        int f = 0;
        int g = 10;
        int k = 1;
        while(k<=g){f+=k;k+=1;}
        System.out.println("f = "+f);
        }
    }

