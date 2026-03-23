import java.util.Scanner;

public class NumPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();

        for(int i=2 ; i<=num ; i++){
            boolean isPrime = true;
            
            for(int j=2 ; j<=Math.sqrt(i); j++){        //we can also use 'j*j<=i'
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }
        }
    }
}
