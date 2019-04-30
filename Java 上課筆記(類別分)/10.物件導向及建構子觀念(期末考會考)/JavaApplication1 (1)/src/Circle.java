/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Circle {
    /*    
     public String color;//訂出顏色
     public double radius;//訂出半徑

     public double getArea() { //訂出面積
     return Math.PI * Math.pow(radius, 2);
     }

     public double getPerimeter() { //訂出周長
     return 2 * Math.PI * radius;
     }
     */
//    private /*私有財的機制，資料會被隱藏*/ String color;
//    private double radius;

//    public String getColor/*取得用get*/() {
//        return color;
//    }
//    public void setColor/*設定用set*/(String color) {
//        this/*物件自身的意思*/.color = color;
        /*如果沒有寫this就是改自己color，而不是改圓圈的顏色*/
    /*不要寫
     public void setColor(String color1)
     color = color1
     無須為了分辨變數而多設一個變數
     */
//    }
//    public double getRadius() {
//        return radius;
//    }
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }
//    public double getArea() { //訂出面積
//        return Math.PI * Math.pow(radius, 2);
//    }
//    public double getPerimeter() { //訂出周長
//        return 2 * Math.PI * radius;
//    }
    //機器來寫程式~~~
    //右鍵-->Refactor-->Encapsulate Fields...-->看看自己想要公開什麼
    //這種感覺較好像我們可以看成績，但不行更改成績
    private String color;//訂出顏色
    private double radius;//訂出半徑

    public double getArea() { //訂出面積
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public double getPerimeter() { //訂出周長
        return 2 * Math.PI * getRadius();
    }
//    private String color;
//    private double radius;

//物件導向中允許的寫法
//進階寫法(多型(態)觀念).1
    //呼叫75行副程式
    public Circle() {
        this(1.0);
    }
//進階寫法(多型(態)觀念).2
    //呼叫109行那個副程式
    public Circle(double radius) {
        this("black", radius);
    }

    //建構子
    //01. 建構子沒有型態
    //02. 建構子一定要和類別名稱相同
    //03. 建構子因為是設定初植，所以不需要有傳回植-->沒有傳回植，連傳回void都不行(void不能寫)
    //04. 參數自設
    //05. 觀念和set很像
    //06. 建構子只能在第一行被呼叫一次，設定完資料就不能改變了，和set最大不同於此(set可以更改資料重複使用)
    //07. 建構子有點像蓋房子的地基
    //08. 不設立建構子，Java會自動設立一個沒有任何參數的 defult contracter (內定建構子)
    //09. 在defult contracter中，如果沒有資料，就以最簡單的代替(字串以null(空字串)、數字以0代替)
    //10. 自己寫一個建構子，空的建構子(內定建構子)會自動消失
    //11. 如果兩個都要(空的建構子和自訂建構子)就只能兩個都寫了
    
    //可以按右鍵-->Insert Code-->選擇你要的東西
    //讓NetBeans自己寫程式
//普通寫法.1
//    public Circle() {
//}
    
//普通寫法.2
//    public Circle(double radius) {
//        this.radius = radius;
//   }

//chage 104-107 to 109-113
/*    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }*/
    
    public Circle(String color, double radius) {
        this.color = color;
        this.setRadius(radius);//判斷資料合法性
        //呼叫setter
    }

    /*toString修正*/
    @Override
    public String toString() {
        // return "Circle{" + "color = " + color + " , radius = " + radius + "}";/*簡短寫法，取得資訊較少*/
        return String.format("Circle{color = %s , radius = %.3f , area = %.3f , perimeter = %.3f }"
                , color, radius, this.getArea(), this.getPerimeter());
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * // * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * // * @param radius the radius to set
     */
    //chage 148-150 to 152-158 --> 確立合法性 connct to 109-113
    /*public void setRadius(double radius) {
        this.radius = radius;
    }*/
    
    public void setRadius(double radius) {
        if(radius < 0 ){
            radius = 1.0;
        }
        this.radius = radius;
    }
}
