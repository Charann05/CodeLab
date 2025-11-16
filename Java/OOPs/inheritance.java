//This program demonstrates method overloading and multilevel inheritance to calculate areas of different shapes.

package Java_Samples.OOPS;

class Shape{
    public void print(){
        System.out.println("Calculates Area");
    }
}

class Triangle extends Shape{
    public void print(int l, int h){
        System.out.println("Area of Trinagle : " +0.5*l*h);
    }
}

class EquilateralTriangle extends Triangle{
    public void print(int side){
        double area = (Math.sqrt(3) / 4) * side * side;
        System.out.println("Area of Equilateral Triangle : " + area);
    }
}

class Circle extends Shape{
    public void print(int r){
        System.out.println("Area of Circle : "+(3.14)*r*r);
    }
}

public class inheritance {
    public static void main(String[] args){
        Shape s = new Shape();
        Triangle t = new Triangle();
        EquilateralTriangle e = new EquilateralTriangle();
        Circle c = new Circle();

        s.print();
        t.print(10, 5);
        e.print(6);
        c.print(4);
    }
    
}

