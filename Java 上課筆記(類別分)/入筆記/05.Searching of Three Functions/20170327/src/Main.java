
import java.util.Arrays;

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
        //資料排序是為了搜尋
        //Sequential Search
        //資料是否排序會影響搜尋方法
        int[] data1 = {4, 8, 1, 7, 9, 3, 10, 5, 2};
        int key1 = 7;
        //有資格當key的是一個不存在的資料
        //資料有重複性質的就是不能當key
        System.out.println("Sequential Search");
        System.out.println("data = " + Arrays.toString(data1));
        System.out.println("key = " + key1);
        System.out.println("index = " + sequential_search1(data1, key1));

        //有資格當key的是一個不存在的資料
        //資料有重複性質的就是不能當key
        int[] data2 = {4, 8, 1, 7, 9, 3, 10, 5, 2};
        int key2 = 10;
        System.out.println("Binary Search");
        System.out.println("data = " + Arrays.toString(data2));
        System.out.println("key = " + key2);
        System.out.println("index = " + binary_search(data2, key2));
        System.out.println("內建");
        System.out.println(Arrays.binarySearch(data2, key2));

        //平均數、離均差、離均差平方
        //叫出1-100
        for (int i = 0; i < 0; i++) {

        }

        //ACM 10591 Happy Number
        
    }

    static int sequential_search1(int[] a, int x) {
        //循序搜尋法
        //直截性的搜尋(一個一個比對)
        for (int i = 0; i < a.length; i++) {
            //標準寫法
            if (x == a[i]) {
                return i;
                //傳回位置(是一個提供資訊的方法)
            }
        }
        return -1;
        //在for迴圈外，因為要跳出迴圈
        //-1是傳回一個不存在的位置
        //因為負數在java中是一個不存在的索引
        //兩個return就像是捷運站有兩個出口的概念
    }

    static int sequential_search2(int[] a, int x) {
        int index = -1;
        for (int i = 0; (i < a.length) && (index < 0); i++) {
            if (x == a[i]) {
                index = i;
            }
        }
        return index;
        //只有一個return就只有一個出口
        //在大型副程式中使用比較不會出錯
    }


    /*
     //極度錯誤邏輯
     static int sequential_search2(int[] a, int x) {
     //直截性的搜尋(一個一個比對)
     for (int i = 0; i < a.length; i++) {
     //標準寫法
     if (x == a[i]) {
     return i;
     //傳回位置(是一個提供資訊的方法)
     } else {
     return -1;
     }
     }
     }
     */
    //Binary Search
    //二分搜尋法
    //若要執行很多次的話，應該要有不同的邏輯
    //例如英文字典，查字時要先排英文字母的順序
    //因為沒有預測落點，所以和我們人查英文字典不一樣
    //所以如果要有效率的話，要先排序再執行
    //(key在data中)在如果合法的話，左邊永遠小於右邊(left<right)
    //(key不在data中)但是如果非法的會左右會錯身而過(left>right)
    
    static int binary_search(int[] a, int x) {
        int index = -1, left = 0, right = a.length - 1;
//有問題
        while ((left <= right) && (index < 0)) {
            int mid = (left + right )/ 2;
            //在排序後，從資料中間找資料(從資料中間開始比較)
            //中間 = (0+(n-1))/2取整數(用高斯符號，在java中直接用" / "即可)
            //優勢是每次至少省掉一半的資料蒐尋次數(跟循序搜尋法相比)    
            //System.out.println("L=%d, R=%d,M=%d,DATA[M]=%d\n",left,right,mid,a[mid]);
            if (x == a[mid]) {
                index = mid;
            } else if (x < a[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            return index;
        }
        return -1;
    }

    static double mean(double[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }

    static double variance(double[] a) {
        double mean = mean(a);
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += Math.pow(a[i] - mean, 2);
        }
        return sum / a.length;
    }

    static double standardDeviation(double[] a) {
        return Math.sqrt(variance(a));
    }
}
