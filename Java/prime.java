//This program tells if the given number is Prime or Not Prime.

package Java_Samples;
import java.util.Scanner;

public class prime {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        sc.close();

        if(n<=1){
            System.out.println(n+" is not Prime");
        }
        else{
            int flag =0;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    flag = 1;
                    break;
                }
            }

            if(flag == 0){
                System.out.println(n+" is Prime");
            }
            else{
                System.out.println(n+" is not Prime");
            }
        }
    }
}
