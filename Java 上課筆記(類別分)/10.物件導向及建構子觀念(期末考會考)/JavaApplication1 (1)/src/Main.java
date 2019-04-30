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

        /*物件導向
         1. 資料和運算結合在一起-->類別
         2. 早期資料和運算是分開的
         3. 幾何運算就是很好的例子
         4. 類別是可以自己創立的
         5. 類別裡的稱為方法(有點像屬性的概念)
         6. 除了八個基本型態都要new，讓他變成物件
         7. 類別是在另一個檔案裡面(只有放在同一個專案中即可找到)
         8. 小的程式比規模大的程是好
         */
        //Circle Class
        /*Circle/*類別，一個大的觀念*//* c*//*物件，類別裡面的一個實例*/ /*= new *//*物件導向一律new出來*/ /*Circle();*/
        /*類別 : 人類   物件 : 自己、同學、老師等，一個實際存在的實例*/
        /*
         c.color = "red";// " . "就是"的(取得)"的意思
         c.radius = 3.0;//半徑設浮點數
         */
        /*如果輸入負數(運用錯誤副程式跑的時候)
         run:
         Circle
         color = red
         radius = -3.0
         area = 28.274333882308138
         perimeter = -18.84955592153876
         BUILD SUCCESSFUL (total time: 0 seconds)
         */
        /*
         程式依舊繼續跑，這表示我們應該寫一個隱藏機制來保護他
         不然錯誤會如同滾雪球般越滾越大
         */

        /*
         一旦資料私有化後，c.XXX的點自然也就不能顯示了
         因為資料已經不被允許讀取了
         *//*
         System.out.println("Circle");
         System.out.println("color = " + c.color);
         System.out.println("radius = " + c.radius);
         System.out.println("area = " + c.getArea());
         System.out.println("perimeter = " + c.getPerimeter());
         */




        //正確安全的寫法

        //Circle c = new Circle();
        //c.setColor("red"/*變成一個副程式了*/);
        /*c.setRadius(3.0);
         System.out.println("Circle");
         System.out.println("color = " + c.getColor());
         System.out.println("radius = " + c.getRadius());
         System.out.println("area = " + c.getArea());
         System.out.println("perimeter = " + c.getPerimeter());
         System.out.println("circle = "+c.toString());*//*設為字串，一次輸出*/
        /*circle = Circle@15db9742  toString修正前結果*/
        /*circle = Circle{color=red,radius=3.000,area=28.274,perimeter=18.850} toString修正後結果*/
        /*修正詳見副程式*/

        //修正toString後，主程式可簡化成
        /*Circle c = new Circle();
         c.setColor("red");
         c.setRadius(3.0);
         System.out.println(c);*//*自動呼叫toString*/
        /*
         run:
         Circle{color=red,radius=3.000,area=28.274,perimeter=18.850}
         BUILD SUCCESSFUL (total time: 1 second)
         */

        //寫法一(按照內建)
        Circle c = new Circle();
        System.out.println("c = " + c);

        //寫法二(自設半徑)
        c = new Circle(2.0);
        System.out.println("c = " + c);

        //寫法三(自設半徑及顏色)
        c = new Circle("red", 3.0);
        System.out.println("c = " + c);

        //測試合法性
        c = new Circle("blue", -4.0);
        System.out.println("c = " + c);
    }
}
