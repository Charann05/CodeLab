//This program checks if the given word is a Palindrome.

package Java_Samples;
import java.util.Scanner;

public class palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String s = sc.nextLine();
        s = s.toLowerCase();

        int i=0,j=s.length()-1;
        while(i<j){

            if(s.charAt(i) != s.charAt(j)){
                System.out.println("It is not a Palindrome");
                System.exit(0);
            }
            i++;
            j--;
            
        }

        System.out.println("It is a Palindrome");
        sc.close();
    }
    
}
