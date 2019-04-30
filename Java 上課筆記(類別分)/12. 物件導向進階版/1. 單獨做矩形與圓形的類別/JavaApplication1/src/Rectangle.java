/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Rectangle {

    //在物件導向的觀念中，相同的程式(名字一樣應該省略)抽出來
    private String color;    //<和Circle重複>
    private int width;
    private int height;

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(int width, int height) {
        this("black", width, height);
    }

    public Rectangle(String color, int width, int height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    /**
     * @return the color
     */
     //<和Circle重複>
     public String getColor() {
     return color;
     }
    /**
     * @param color the color to set
     */
     //<和Circle重複>
     public void setColor(String color) {
     this.color = color;
     }
    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

     //<和Circle重複>
     public double getArea() {
     return this.width * this.height;
     }
    
     //<和Circle重複>
     public double getPerimeter() {
     return 2 * (this.width + this.height);
     }
     
     //<和Circle重複>
     @Override
     public String toString() {
     return String.format("Rectangle{color = %s , width = %d , height = %d , area = %.3f , perimeter = %.3f }",
     this.getColor(), this.width, height, this.getArea(), this.getPerimeter());
     }
}
