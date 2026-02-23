// Interpolation search for a value in a sorted array.

public class InterpolationSearch {
    public static void main(String[] args) {
        
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int index = interpolationSearch(array, 6);

        if(index != -1){
            System.out.println("Element found at index : " + index);
        }
        else{
            System.out.println("Element not found!");
        }
    }

    public static int interpolationSearch(int[] array, int value){

        int low = 0;
        int high = array.length-1;
        
        while((value >= array[low]) && (value <= array[high]) && (low <= high)){

            int probe = low + (high -low) * (value - array[low]) / (array[high] - array[low]);

            if(value == array[probe]){
                return probe;
            }
            else if(value > array[probe]){
                low = probe + 1;
            }
            else{
                high = probe - 1;
            }
        }
        return -1;
    }
}
