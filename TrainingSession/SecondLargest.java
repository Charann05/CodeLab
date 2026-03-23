public class SecondLargest {
    public static void main(String[] args) {
        //int[] a = {4,3,5,6,1,2};
        // int[] a = {1,1,1,1,1};
        //int[] a = {1};
        int[] a = {-12,-13,1,0,1};

        int largest = a[0];
        int sec = Integer.MIN_VALUE;

        for(int i=1; i<a.length ; i++){

            if(largest < a[i]){
                sec = largest;
                largest = a[i];
            }else if(a[i] > sec && a[i] < largest){
                sec = a[i];
            }
        }

        if(sec == Integer.MIN_VALUE){
            System.out.println("Second largest element does not exist");
        }
        else{
            System.out.println(sec);
        }
    }
}
