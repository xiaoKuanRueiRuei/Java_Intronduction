/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Circle extends Shape {

    //抽象方法的方式表示強制要求繼承的類別需將其寫完
    //Circle紅線原因是因為找不到抽象方式所指示的程式
    //可以將Circle反白並且按下Implement abstract ...
    //計算機會將其主要幹架程式寫出
    //我們只須寫公式即可
    //extends是擴充的意思
    //子類別(Circle)會繼承所有上一代母類別(Shape)的功能
    //子類別功能只會多不會少

    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        super();
        //connect to Shape class 17-19
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        //指向自己(子類別，Circle)的叫this，指向母類別(Shape)的叫super
        //connect to Shape class 21-23
        this.radius = radius;
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    //因為還沒寫輸出，所以沿用母類別輸出模式(toString)
    /*
     run:
     c = Shape{color=black}
     c = Shape{color=black}
     c = Shape{color=red}
     c = Shape{color=blue}
     BUILD SUCCESSFUL (total time: 0 seconds)
     */
    //更改母類別toString後之輸出
    /*
     run:
     c = Shape{color = black, area = 3.142, perimeter = 6.283}
     c = Shape{color = black, area = 12.566, perimeter = 12.566}
     c = Shape{color = red, area = 28.274, perimeter = 18.850}
     c = Shape{color = blue, area = 50.265, perimeter = -25.133}
     BUILD SUCCESSFUL (total time: 0 seconds)
     */
    @Override
    public String toString() {
        return " Circle { " + " radius = " + radius + super.toString() + " } ";
    }
    //增加子類別輸出程式後之輸出
    /*
     run:
     c =  Circle {  radius = 1.0Shape { color = black , area = 3.142 , perimeter = 6.283 }  } 
     c =  Circle {  radius = 2.0Shape { color = black , area = 12.566 , perimeter = 12.566 }  } 
     c =  Circle {  radius = 3.0Shape { color = red , area = 28.274 , perimeter = 18.850 }  } 
     c =  Circle {  radius = -4.0Shape { color = blue , area = 50.265 , perimeter = -25.133 }  } 
     BUILD SUCCESSFUL (total time: 0 seconds)
     */
}
