// Kadane’s Algorithm: max subarray sum with indices.

public class Kadane {
    public static void main(String[] args) {
        
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int tempStart = 0;
        int end = 0;

        for(int i=0 ; i<arr.length ; i++){

            sum += arr[i];
            

            if(sum > max){
                max = sum;
                end = i;
                start = tempStart;
                
            }

            if(sum < 0){
                sum = 0;
                tempStart = i+1;
            }
        }

        System.out.println("Max sum of sub array is : "+max);
        
        for(int i=start ; i<=end ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
