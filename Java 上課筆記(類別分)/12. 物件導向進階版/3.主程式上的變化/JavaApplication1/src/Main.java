
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
        /*
         Shape y = new Circle();
         System.out.println(y);

         y = new Circle(2.0);
         System.out.println(y);

         y = new Circle("red", 3.0);
         System.out.println(y);

         /*
         run:
         Circle {  radius = 1.0 , Shape { color = black , area = 3.142 , perimeter = 6.283 }  } 
         Circle {  radius = 2.0 , Shape { color = black , area = 12.566 , perimeter = 12.566 }  } 
         Circle {  radius = 3.0 , Shape { color = red , area = 28.274 , perimeter = 18.850 }  } 
         */
        /*
         Shape r = new Rectangle();
         System.out.println(r);

         r = new Rectangle(4, 5);
         System.out.println(r);

         r = new Rectangle("red", 4, 5);
         System.out.println(r);

         /*
         run:
         Rectangle {  width = 1 height = 1 , Shape { color = black , area = 1.000 , perimeter = 4.000 }  } 
         Rectangle {  width = 4 height = 5 , Shape { color = black , area = 20.000 , perimeter = 18.000 }  } 
         Rectangle {  width = 4 height = 5 , Shape { color = red , area = 20.000 , perimeter = 18.000 }  } 
         */
        //Shape Demo
        //將多筆資料化為陣列計算
        /*
         Shape a = new Circle("red", 4.0);
         Shape b = new Circle("green", 5.0);
         Shape c = new Rectangle("blue", 6, 7);
         Shape[] shapes = {a, b, c};

         double area = 0.0;
         for (Shape x : shapes) {
         area += x.getArea();
         }
         System.out.format("total area = %.3f\n", area);
         }
         /*
         run:
         total area = 170.805
         */
        //Sorted by color
        /*
         Shape d = new Circle("red", 4.0);
         Shape e = new Circle("green", 5.0);
         Shape f = new Rectangle("blue", 6, 7);
         List<Shape> shapes = new ArrayList<>();
         //ArrayList可以產生一個實作版本
         //List只是一個介面，本身並沒有寫完，所以在ArrayList不能寫List
         shapes.add(d);
         shapes.add(e);
         shapes.add(f);
         shapes.sort(Comparator.comparing(Shape::getColor));
         //Comparator比較子
         for (Shape y : shapes) {
         System.out.println(y);
         }
         }*/
        /*
         run:
         Rectangle {  width = 6 height = 7 , Shape { color = blue , area = 42.000 , perimeter = 26.000 }  } 
         Circle {  radius = 5.0 , Shape { color = green , area = 78.540 , perimeter = 31.416 }  } 
         Circle {  radius = 4.0 , Shape { color = red , area = 50.265 , perimeter = 25.133 }  } 
         BUILD SUCCESSFUL (total time: 0 seconds)
         */
        //Sorted by color
/*
        Shape g = new Circle("red", 4.0);
        Shape h = new Circle("green", 5.0);
        Shape i = new Rectangle("blue", 6, 7);
        List<Shape> shapes = new ArrayList<>();
        //ArrayList可以產生一個實作版本
        //List只是一個介面，本身並沒有寫完，所以在ArrayList不能寫List
        shapes.add(g);
        shapes.add(h);
        shapes.add(i);
        Comparator comparator = Comparator.comparing(Shape::getArea);
        shapes.sort(comparator);
        for (Shape y : shapes) {
            System.out.println(y);
        }
    }
    /*
    run:
    Rectangle {  width = 6 height = 7 , Shape { color = blue , area = 42.000 , perimeter = 26.000 }  } 
    Circle {  radius = 4.0 , Shape { color = red , area = 50.265 , perimeter = 25.133 }  } 
    Circle {  radius = 5.0 , Shape { color = green , area = 78.540 , perimeter = 31.416 }  } 
    BUILD SUCCESSFUL (total time: 0 seconds)
    */
        Shape g = new Circle("red", 4.0);
        Shape h = new Circle("green", 5.0);
        Shape i = new Rectangle("blue", 6, 7);
        List<Shape> shapes = new ArrayList<>();
        //ArrayList可以產生一個實作版本
        //List只是一個介面，本身並沒有寫完，所以在ArrayList不能寫List
        shapes.add(g);
        shapes.add(h);
        shapes.add(i);
        Comparator comparator = Comparator.comparing(Shape::getArea);
        shapes.sort(comparator.reversed());
        //reversed() 資料由大到小(順序顛倒)
        for (Shape z : shapes) {
            System.out.println(z);
        }
    }
    /*
    run:
    Circle {  radius = 5.0 , Shape { color = green , area = 78.540 , perimeter = 31.416 }  } 
    Circle {  radius = 4.0 , Shape { color = red , area = 50.265 , perimeter = 25.133 }  } 
    Rectangle {  width = 6 height = 7 , Shape { color = blue , area = 42.000 , perimeter = 26.000 }  } 
    BUILD SUCCESSFUL (total time: 0 seconds)
    */
}
