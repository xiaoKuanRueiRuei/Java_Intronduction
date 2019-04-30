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

    private String color;    //<和Rectangle重複>
    private double radius;

    //<和Rectangle重複>
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
    
    //<和Rectangle重複>
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }
    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this("black", radius);
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.setRadius(radius);
    }

    @Override
    public String toString() {
        return String.format("Circle{color = %s , radius = %.3f , area = %.3f , perimeter = %.3f }", color, radius, this.getArea(), this.getPerimeter());
    }

    /**
     * @return the color
     */
    //<和Rectangle重複>
    public String getColor() {
        return color;
    }
    
    /**
     * // * @param color the color to set
     */
    //<和Rectangle重複>
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            radius = 1.0;
        }
        this.radius = radius;
    }
}
