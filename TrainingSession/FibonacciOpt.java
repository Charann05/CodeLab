import java.util.HashMap;

public class FibonacciOpt {

    public static HashMap<Integer, Integer> fib = new HashMap<>();
    public static void main(String[] args) {
        
        int n = 10;

        int fibo = fib(n);
        System.out.println(fibo);
    }

    public static int fib(int n){

        if(n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        if(fib.containsKey(n)){
            return fib.get(n);
        }
        else{
            fib.put(n,fib(n-1)+fib(n-2));
        }
        return fib.get(n);
    }
}
