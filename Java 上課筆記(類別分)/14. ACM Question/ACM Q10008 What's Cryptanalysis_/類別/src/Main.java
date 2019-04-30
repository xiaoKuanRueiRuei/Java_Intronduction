
import java.util.Arrays;
import java.util.Comparator;
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
        //ACM Q10008 What's Cryptanalysis?
        //頻率分析法
        //兩層排序(數字跟字母順序)

        //類別初始設定
        Letter[] a = new Letter[26];
        //宣告一個陣列，有26筆資料
        for (int i = 0; i < a.length; i++) {
            a[i] = new Letter((char) (i + 'A'), 0);
            //java中，字元就是數字
            //char是只說將其視為字元來看
        }

        /*
         System.out.println((int)'A');
         run:
         65
         */
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int k = Integer.valueOf(s);
        for (int j = 0; j < k; j++) {
            s = input.nextLine().toUpperCase();
            //toUpperCase()將所有字母轉為大寫
            f(s, a);
        }

        Arrays.sort(a, Comparator.comparing(Letter::getCount).reversed()
                .thenComparing(Letter::getA));

        //先以頻率排序(需要大到小，所以用reversed)
        //排序可以給多個條件去排序
        //先按大小(getCount)排
        //再按字母順序(getA)排
    //System.out.println(Arrays.toString(a));
        for (Letter x:a){
        if (x.getCount() > 0) {
                System.out.println(x);
            }
        }
    }

    static void f(String s, Letter[] a) {
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            //charAt-->character at 字元位置
            if ('A' <= x && x <= 'Z') {
                //判斷字母是否為A到Z之間
                int y = x - 'A';
                //y為陣列索引
                //因為A代表1
                //所以A-A=0
                //B-A=1
                //運用這種方法可以將字母轉換為數字
                a[y].setCount(a[y].getCount() + 1);
                //getCount加1是因為一開始A已經被減一了
                //將這個新東西再setCount回去
            }
        }
    }
}
/*
3
This is a test.
Count me 1 2 3 4 5.
Wow!!! Is yhis question easy?
*/

/*
run:
S 7
I 5
T 5
E 4
O 3
A 2
H 2
N 2
U 2
W 2
Y 2
C 1
M 1
Q 1
*/
