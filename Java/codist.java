//This program calculates the distance between two points using the Math class.

package Java_Samples;
import java.util.Scanner;

public class codist {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 : ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1 : ");
        int y1 = sc.nextInt();
        System.out.print("Enter x2 : ");
        int x2 = sc.nextInt();
         System.out.print("Enter y2 : ");
        int y2 = sc.nextInt();
        
        double dist = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));

        System.out.println("Distance between the coordinates are : "+dist);
        sc.close();
    }
    
}
