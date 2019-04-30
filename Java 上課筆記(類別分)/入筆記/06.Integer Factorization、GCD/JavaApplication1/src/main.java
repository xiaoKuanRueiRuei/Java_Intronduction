/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Integer Factorization 因數分解主程式
        int n = 360;
        int m = 480;
        factors1(n);
        factors2(n);
        factors3(n);

        //GCD 最大公因數
        System.out.println(GCD1(n, m));
        System.out.println(GCD2(n, m));
        System.out.println(GCD3(n, m));
        //互質

    }

    public static void factors1(int n) {
        //Integer Factorization 因數分解副程式
        System.out.print(n + ": ");
        //打println會換行
        //print不會換行
        for (int i = 0; i <= n; i++) {
            if (n % i == 0) {
                //if是測試i是否整除n
                while (n % i == 0) {
                    //事先不知道次數
                    //while只是為了要除以i
                    n /= i;
                }
                System.out.print(i);
                if (n > 1) {
                    //n>1表示程式還沒結束
                    System.out.print(" ");
                    //不同因數間印空白
                }
            }

        }
        System.out.println();
    }

    public static void factors2(int n) {
        //Integer Factorization 因數分解副程式
        System.out.print(n + ": ");
        for (int i = 2; i <= n; i++) {
            //if (n % i == 0) {
            //因為輸出已經放到迴圈裡面了
            //所以if和while是一樣功能的，這時候if就可以不要寫了
            while (n % i == 0) {
                n /= i;
                System.out.print(i);
                if (n > 1) {
                    System.out.print(" * ");
                }
            }
            //}

        }
        System.out.println();
    }

    public static void factors3(int n) {
        //Integer Factorization 因數分解副程式，最常用，常考
        System.out.print(n + ": ");
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                int count = 0;
                while (n % i == 0) {
                    n /= i;
                    count += 1;
                }
                if (count > 1) {
                    System.out.print(i + " ^ " + count);
                } else {
                    System.out.print(i);
                }
                if (n > 1) {
                    System.out.print(" * ");
                }
            }
        }
        System.out.println();
    }

    public static int GCD1(int a, int b) {
        //最大公因數副程式(輾轉相除法)
        while (b > 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
        //原本應該要小的數字放後面，可是就算放反了好像也無所謂
        //原因是因為這樣會變成"大的數字(b)x0+小的數字(這時候r=a)"
        //可是在轉換的時候a,b兩數會交換

    }

    public static int GCD2(int a, int b) {
        //最大公因數副程式(輾轉相除法)遞迴寫法，非常常考
        if (b == 0) {
            return a;
        } else {
            return GCD2(b, a % b);
            //交換位置
        }
    }

    public static int GCD3(int a, int b) {
        //遞迴的三元寫法
        return (b == 0) ? a : GCD2(b, a % b);
        // ? : -->若?左邊成立則做:左邊否則做:右邊
    }

    public boolean Coprime(int a, int b) {
        //互質
        return GCD3(a, b) == 1;
    }
}
