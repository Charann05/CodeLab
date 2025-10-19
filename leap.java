//This program tells if the given year is Leap year or not.

package Java_Samples;
import java.util.Scanner;

public class leap {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int y = sc.nextInt();

        if(y%400==0){
            System.out.println(y+" is a Leap Year");
        }
        else if(y%100==0){
            System.out.println(y+" is not a Leap Year");
        }
        else if(y%4==0){
            System.out.println(y+" is a Leap Year");
        }
        else{
            System.out.println(y+" is not a Leap Year");
        }
        sc.close();
    }
    
}

