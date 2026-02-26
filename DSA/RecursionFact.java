// Calculates the factorial of a number using recursion.

public class RecursionFact {
    public static void main(String[] args) {
        
        System.out.println(factorial(3));
    }

    public static int factorial(int num){
        if(num < 1)
            return 1;
        return num * (factorial(num - 1));
    }
}
