//This program converts a negative integer to positive.

package Java_Samples;
import java.util.Scanner;
public class convert {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a negative integer : ");
        int n = sc.nextInt();
        if (n < 0) {
            n = -n;
        }
        System.out.println(n);
        sc.close();
    }
    
}
