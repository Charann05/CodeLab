//This program calculates the area of a circle using the Math class.

package Java_Samples;

import java.util.Scanner;

public class circlearea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the Circle : ");
        int r = sc.nextInt();

        double area = Math.PI*Math.pow(r, 2);

        System.out.println("The area of the circle is : "+area);
        sc.close();
    }
    
}
