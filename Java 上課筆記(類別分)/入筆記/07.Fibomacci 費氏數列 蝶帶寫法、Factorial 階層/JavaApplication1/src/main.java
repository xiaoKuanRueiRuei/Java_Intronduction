
import java.math.BigInteger;

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
        //Factorial 階層
        int n1 = 30;
        for (int i = 1; i <= n1; i++) {
            System.out.format("%2d! = %d\n", i, factorial(i));
        }
        /*run:
         1! = 1
         2! = 2
         3! = 6
         4! = 24
         5! = 120
         6! = 720
         7! = 5040
         8! = 40320
         9! = 362880
         10! = 3628800
         11! = 39916800
         12! = 479001600
         13! = 6227020800
         14! = 87178291200
         15! = 1307674368000
         16! = 20922789888000
         17! = 355687428096000
         18! = 6402373705728000
         19! = 121645100408832000
         20! = 2432902008176640000
         21! = -4249290049419214848
         22! = -1250660718674968576
         23! = 8128291617894825984
         24! = -7835185981329244160
         25! = 7034535277573963776
         26! = -1569523520172457984
         27! = -5483646897237262336
         28! = -5968160532966932480
         29! = -7055958792655077376
         30! = -8764578968847253504
         BUILD SUCCESSFUL (total time: 1 second)
         */
        //數字太大會爆掉，用整數做的關係，而且爆掉java不會跟你說，Python相對安全

        //java為了資安問題，導入了大整數
        //也有大的浮點數
        int n2 = 30;
        BigInteger a = BigInteger.ONE;
        for (int i = 0; i <= n2; i++) {
            BigInteger b = (i <= 0) ? BigInteger.ONE : BigInteger.valueOf(i);
            //valueOf是轉型指令
            a = a.multiply(b);
            //因為BigInteger不可直接使用加減乘除，所以要用a.multiply(乘法)來寫
            System.out.format("%2d! = %d\n", i, a);
        }
        /*
         0! = 1
         1! = 1
         2! = 2
         3! = 6
         4! = 24
         5! = 120
         6! = 720
         7! = 5040
         8! = 40320
         9! = 362880
         10! = 3628800
         11! = 39916800
         12! = 479001600
         13! = 6227020800
         14! = 87178291200
         15! = 1307674368000
         16! = 20922789888000
         17! = 355687428096000
         18! = 6402373705728000
         19! = 121645100408832000
         20! = 2432902008176640000
         21! = 51090942171709440000
         22! = 1124000727777607680000
         23! = 25852016738884976640000
         24! = 620448401733239439360000
         25! = 15511210043330985984000000
         26! = 403291461126605635584000000
         27! = 10888869450418352160768000000
         28! = 304888344611713860501504000000
         29! = 8841761993739701954543616000000
         30! = 265252859812191058636308480000000
         BUILD SUCCESSFUL (total time: 0 seconds)
         */

        //Fibomacci 費氏數列 蝶帶寫法
        int n3 = 30;
        for (int i = 1; i <= n3; i++) {
            System.out.format("Fibomacci(%2d) = %d\n", i, Fibomacci(i));
        }
        //遞迴寫法
        int n4 = 30;
        for (int i = 1; i <= n4; i++) {
            System.out.format("Fibomacci(%2d) = %d\n", i, Fibomacci2(i));
        }

        //Base Conversion 基底轉換(其他進位轉十進位)
        int n5 = 100;
        System.out.println("n = " + n5);
        System.out.println("Binary : " + 0b1100100);
        //二進位的話前面先寫0b，b指binary
        System.out.println("Octal : " + 0100);
        //八進位，如果數字是0開頭，就代表8進位
        //整數前面絕對不可以加0，不然電腦會誤判為8進位寫法
        //Python中整數前面如果是0，就不run了
        System.out.println("Hex : " + 0x64);
        //16進位，x代表Hex
        
        //在java中，如果想要基底轉換可以用valueOf後面輸入你要轉換的看你要的位數
        //最大支援到36進位
        System.out.println("Base 10 : " + Integer.valueOf("100"));
        System.out.println("Binary : " + Integer.valueOf("1100100", 2));
        //用字串是因為會夾雜字母，所以以字串表現
        System.out.println("Octal : " + Integer.valueOf("144", 8));
        System.out.println("Hex : " + Integer.valueOf("64", 16));
        
        System.out.println("Base 36 : " + Integer.valueOf("Hello", 36));
        System.out.println("Base 36 : " + Long.valueOf("CafeBabe", 36));
        //用long是因為比較長xDD
        //輸入與大小寫無關
        
        //十進位轉其他進位
        System.out.println("n = "+n5);
        System.out.println("Binary : "+Integer.toBinaryString(n5));
        System.out.println("Octal : "+Integer.toOctalString(n5));
        System.out.println("Hex : "+Integer.toHexString(n5));
        
        System.out.println("Base 4 : "+Integer.toString(n5,4));
        System.out.println("Base 12 : "+Integer.toString(n5,12));
        System.out.println("Base 36 : "+Integer.toString(n5,36));
    }
    
    static long factorial(int n) {
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /* static long Binominal(int n,int r) {
     //Cn取r，回去用大整數做做看
     }*/
    static long Fibomacci(int n) {
        //費氏數列
        long a = 0, b = 1;
        for (int i = 0; i <= n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        return a;
    }

    static long Fibomacci2(int n) {
        //過大的資料要跑非常久不建議使用
        return (n <= 1) ? n : Fibomacci2(n - 1) + Fibomacci2(n - 2);
        /*同以下寫法
         if(n<=1){
         return n;
         } else {
         return Fibomacci2(n-1)+Fibomacci2(n-2);
         }
         */
    }
    
}
