//This program generates the multiplication table of the given value.

package Java_Samples;
import java.util.Scanner;

public class table {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease enter the number to generate its multiplication table :");
        int n = sc.nextInt();
        System.out.println("\nEnter the range up to which the table should be displayed :");
        int m = sc.nextInt();
        System.out.println("\nPrinting the table of "+n);
        System.out.println("--------------------------");
        for(int i=1;i<=m;i++){
            System.out.println(n+"x"+i+"="+n*i);
        }
        sc.close();
    }
    
}
