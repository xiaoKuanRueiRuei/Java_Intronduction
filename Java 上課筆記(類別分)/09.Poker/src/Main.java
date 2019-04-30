
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Poker
        Random rnd = new Random();
        int n = rnd.nextInt(52);
        suit(n);
        rank(n);
        System.out.println(suit(n) + rank(n));

        for (int i = 0; i < 52; i++) {
            System.out.print(suit(i) + rank(i));
            if ((i + 1) % 13 == 0) {
                System.out.println();
            } else {
                System.out.format(" ");
            }
        }
        //Poker 自動發牌
        hand();
        for (int i = 0; i < 1/*這邊的迴圈數是發幾副牌*/; i++) {
            System.out.println(Arrays.toString(hand()));
        }

        //測試是否為同花色
        for (int i = 0; i < 1; i++) {
            String[] a = hand();
            System.out.println(Arrays.toString(a) + "  同花  " + flush(a));
        }

        //測試是否為四條
        for (int i = 0; i < 10; i++) {
            String[] a = hand();
            System.out.println(Arrays.toString(a) + "  鐵支  " + four_of_a_kind(a));
        }

    }

    static String suit(int n) {
        int x = n / 13;
        //整數除以整數答案是整數
        String y;
        if (x == 0) {
            y = "黑桃";
        } else if (x == 1) {
            y = "紅心";
        } else if (x == 2) {
            y = "方塊";
        } else {
            y = "梅花";
        }
        return y;
    }

    static String rank(int n) {
        int x = n % 13 + 1;
        String y;
        if (x == 1) {
            y = "A";
        } else if (x == 11) {
            y = "J";
        } else if (x == 12) {
            y = "Q";
        } else if (x == 13) {
            y = "K";
        } else {
            y = String.valueOf(x);
        }
        return y;
    }

    static String suit2(int n) {
        //比較深難的寫法
        return "黑桃 紅心 方塊 梅花".split(" ")[n / 13];//方括號是分割後變成負數的陣列
    }

    static String rank2(int n) {
        //比較深難的寫法
        return "A 2 3 4 5 6 7 8 9 10 J Q K".split(" ")[n % 13];
    }

    static String card(int n) {
        return suit(n) + rank(n);
    }

    static String[] hand() {
        //發出五張不同的牌

        List<Integer> a = new ArrayList<>();
        //建立一個串列
        for (int i = 0; i < 52; i++) {
            a.add(i);
        }
        Collections.shuffle(a);
        //shuffle 洗牌
        //Collection是java裡面的資料結構套件

        String[] b = new String[5];
        for (int i = 0; i < 5; i++) {
            b[i] = card(a.get(i));
        }
        return b;
    }

    static boolean flush(String[]/*傳入字串陣列*/ a) {
        String[] b = Arrays.copyOf(a, a.length);
        //String[] b = a.clone();兩者皆可
        //複製一份(不改變原始數據)

        Arrays.sort(b);
        //排英文的順序
        return b[0].charAt(0) == b[4].charAt(0);
        //如果第一個跟最後一個的英文字母是一樣的，表示是同花，因為已經排序過了

    }

    //counting method
    static boolean flush2(String[] a) {
        int count = 1;//第一張牌出現次數至少是一
        char c = a[0].charAt(0);
        for (int i = 1; i < a.length; i++) {
            if (a[i].charAt(0) == c) {
                count++;
            }
        }
        return count == 5;
    }

    static boolean four_of_a_kind(String[] a) {
        List<String> b = new ArrayList<>();
        for (String x : a) {
            b.add(x.substring(1));
        }
        int count = 0;
        for (int i = 0; i < b.size(); i++) {
            count += Collections.frequency(b, b.get(i));
            //frequency 在某一筆資料中出現的次數，例如 : [3,2,2,2,1]=3(2出現3次)
            //b是資料
            //b.get(i)是察尋的對象
        }
        return count == 17;
        //每一張牌出現次數相加
        //例如[方塊3, 黑桃3, 紅心3, 梅花3, 方塊A]
        //對於[方塊3, 黑桃3, 紅心3, 梅花3]而言，出現次數都是四次-->4+4+4+4=16
        //對於[方塊A]而言，出現次數是一次-->1
        //16+1=17
        
        //撲克牌的神奇數字
        //葫蘆-->2**2+3**2=13
        //一對-->2**2+1+1+1=7
        //三條-->3**2+1+1=11
        //沒有pair-->1+1+1+1+1=5
        //two pair-->2**2+2**2+1=9
    }
    static boolean straight(String []a){
        //判斷順子
        int n = a.length;
        int []b = new int[n];
        for (int i = 0; i < n; i++) {
        b[i] = rank(a[i]);
                }
        Arrays.sort(b);
        
        //at least one pair
        if(count(b)>5){
            return false;
        }return (b[4]-b[0])||(b[0] == 1 && b[1]==10);//A 10 J Q K
    }
}
