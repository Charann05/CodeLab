import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String a = sc.nextLine();

        System.out.println("Enter a character : ");
        char se = sc.next().charAt(0);
        int fre = 0;

        for(int i=0 ; i<a.length() ; i++){
            if(a.charAt(i) == se){
                fre++;
            }
        }

        System.out.println("'" + se + "' occurs " + fre + " times.");
        sc.close();
    }
}
