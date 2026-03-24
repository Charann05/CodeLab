import java.util.ArrayList;
import java.util.Scanner;

public class NumPrimesOpt {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        ArrayList<Boolean> check = new ArrayList<>();
        ArrayList<Integer> primes = new ArrayList<>();

        for(int i=0 ; i<n ; i++){
            check.add(true);
        }

        for(int i=2 ; i<n ; i++){
            if(check.get(i)){
                primes.add(i);
                for(int j=i ; j<n ; j+=i){
                    check.set(j,false);
                }
            }
        }

        //System.out.println(check);
        System.out.println(primes.size());

    }
}
