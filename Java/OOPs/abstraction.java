
import java.util.Scanner;

abstract class Area{
    
    double area;
    abstract double getArea();

}

class Circle extends Area{

    int r;
    Circle(int radius){
        this.r = radius;
    }

    double getArea(){

        area = 3.14 * r * r;
        return area;
    }
}

class SquareRectangle extends Area{

    int l,b;
    SquareRectangle(int length, int breadth){
        this.l = length;
        this.b = breadth;
    }

    double getArea(){

        area = l * b;
        return area;
    }
}

class Triangle extends Area{

    int b,h;
    Triangle(int base, int height){
        this.b = base;
        this.h = height;
    }
    double getArea(){

        area = 0.5 * b * h;
        return area;
    }
}

public class abstraction {
    
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Find Area Of?");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Enter your choice");

        int choice = sc.nextInt();
        System.out.println("----------------------------------------------------------------------------------");
        Area a = null;

        switch (choice) {
            case 1:

                System.out.println("Enter the radius : ");
                int radius = sc.nextInt();
                a = new Circle(radius);
                break;
            
            case 2:
                System.out.println("Enter the length and breadth : ");
                int length = sc.nextInt();
                int breadth = sc.nextInt();
                a = new SquareRectangle(length, breadth);
                break;

            case 3:
                System.out.println("Enter the length and breadth : ");
                int length1 = sc.nextInt();
                int breadth1 = sc.nextInt();
                a = new SquareRectangle(length1, breadth1);
                break;
                
            case 4:
                System.out.println("Enter the base and height : ");
                int base = sc.nextInt();
                int height = sc.nextInt();
                a = new Triangle(base, height);
                break;

            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        System.out.println("Area : "+a.getArea());
        System.out.println("----------------------------------------------------------------------------------");
        sc.close();
    }
}
