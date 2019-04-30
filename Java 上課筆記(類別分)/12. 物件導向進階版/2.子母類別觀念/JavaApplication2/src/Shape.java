/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
//挑出重複程式(同樣名字的副程式)，共同管理
public abstract class Shape {
//因為41-42行有使用抽象方法，所以class也要表示抽象類別(至少含有"一個"抽象方法以上之類別，我們稱之為抽象類別)

    private String color;

    public Shape() {
        this("black");
    }

    public Shape(String color) {
        this.color = color;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    //假裝可以計算出面積與周長(因為在Shape中並不知道是什麼形狀)
    //只是表達需要此功能
    //abstract (a.抽象的) 抽象方法是指目前不知道是什麼功用，但是先寫個空程式起來擺著
    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        //return "Shape{color ="+color+"}";
        return String.format(
                "Shape { color = %s , area = %.3f , perimeter = %.3f } ", this.getColor(), this.getArea(), this.getPerimeter());
    }
}
