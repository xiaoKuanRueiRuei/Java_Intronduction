
import java.util.Arrays;
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

         //BMI 上機測驗是不需要提示詞的
         Scanner input = new Scanner(System.in);
         String s = input.nextLine();
         String[] t = s.split(" ");

         double a = Double.valueOf(t[0]);//value是型態轉換，字串轉文字
         double b = Double.valueOf(t[1]);

         double bmi = b / Math.pow(a / 100, 2);//如果分母用a*a記得要括號
         String status;

         if (bmi < 18.5) {
         status = "體重過輕";
         } else if (bmi < 24) {
         status = "正常範圍";
         } else if (bmi < 27) {
         status = "體重過重";
         } else if (bmi < 30) {
         status = "輕度肥胖";
         } else if (bmi < 35) {
         status = "中度肥胖";
         } else {
         status = "重度肥胖";
         }
         System.out.println("bmi = " + bmi + "，" + status);
         
         //公式解
         double a1 = 2.1;
         double b1 = 3.5;
         double c = 0.2;

         double d = Math.pow(b1, 2) - 4 * a1 * c;
         if (d < 0) {
         System.out.println("無實根");

         } else {
         double r1 = -b1 + Math.sqrt(d) / (2 * a1);
         double r2 = -b1 - Math.sqrt(d) / (2 * a1);
         if (r1 == r2) {

         System.out.println("重根 = " + r1);
         } else {
         System.out.println("r1 = " + r1 + "r2 = " + r2);
         }
         }
         
         //電阻
         double R[] = {200, 100, 400, 300};
         double sum = 0;
         for (int i = 0; i < R.length; i++) {
         sum += 1.0 / R[i];
         }
         double Rt = 1.0 / sum;
         System.out.println("Rt = " + Rt);
         
         //Body Mass Index
         //Java中訂一個函數、方法、參數都必須註明型態，跟Python不一樣
         //整數可以轉浮點數，但不能打字串
         double bmi(double w , double h){
         return w / (h * h);
         //return還回資料的概念    
         }
         
         //Simple Interest
         double P = 10000;
         double r = 5.0 / 100;//這裡不可以寫5/100，這樣子會變成0
         int t = 20;

         double F = P * (1 + (r * t));
         System.out.println("F = " + F);
         
         //Compound Interest
         //Scanner input = new Scanner(System.in);
         String s2 = input.nextLine();
         String[] t2 = s2.split(" ");

         double P = Double.valueOf(t2[0]);//value是型態轉換，字串轉文字
         double r = Double.valueOf(t[1]) / 100 / 12;
        
         int t = 20 * 12; 

         double F = P * Math.pow(1 + r, t);
         System.out.println("F = " + F);
         
         //Min and Max-->期中考非常可能考
         double[] data = {8.0, 0.5, -21.0, 87.0, 23.0, -57.0};
         double min = min(data);//min的副程式見下面
         //因為等號左邊的min是變數名稱，因為沒有括號
         //等號右邊的min是函數
         System.out.println("data = " + Arrays.toString(data));
         //如果不用Arrays就會出現記憶體位置
         System.out.println("min = " + min);
         
         //Max
         double[] data = {8.0, 0.5, -21.0, 87.0, 23.0, -57.0};
         double max = max(data);
         System.out.println("data = " + Arrays.toString(data));
         System.out.println("min = " + max);
         */
        //Jolly Jumper
        
            
    
    }

    static double min(double[] data) {
        //static 是靜態型態
        //在java中如果本身沒有建立新的物件的話
        //則使用靜態的static
        //因為第十九行是用static

        //double將資料傳回來的是浮點數，所以是浮點數
        //[]是陣列，可是傳回時變成一個浮點數
        //所以用浮點數即可
        //()中的[]是一個陣列
        double min = data[0];
        //擂台法
        //一個一個比，僅限於小數據
        //設定起始min為data[0]
        //注意!!!不可以寫min = 0
        //這樣min就是0，萬一最小碼大於0
        //這樣min=0就不存在於data中了
        for (int i = 1; i < data.length; i++) {
            //因為0是min，所以從1開始比
            //如果寫int i = 0，也是對的，可是沒有意義自己跟自己比
            //邏輯正確，可是經驗不周全
            //這邊length不可以用小於等於
            //不然會掛掉
            if (data[i] < min) {
                min = data[i];
                //如果data[i]小於原始min
                //min = data[i]
            }
        }
        return min;
    }

    private static double max(double[] data) {
        double max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }
}
