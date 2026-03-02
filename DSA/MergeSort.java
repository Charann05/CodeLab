// Merge Sort implementation in Java.

public class MergeSort {
    public static void main(String[] args) {
        
        int[] array = {4,3,6,5,1,8,7,2,9};

        mergeSort(array);

        for(int i : array){
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int[] array){

        int length = array.length;

        if(length <= 1){
            return;
        }

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0;
        int j = 0;

        for(; i<length ; i++){
            if(i < middle){
                leftArray[i] = array[i];
            }
            else{
                rightArray[j] = array[i];
                j++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);

    }

    public static void merge(int[] leftArray, int[] rightArray, int[] array){

        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int i = 0;
        int l = 0;
        int r = 0;

        while((l < leftSize) && (r < rightSize)){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                l++;
                i++;
            }
            else{
                array[i] = rightArray[r];
                r++;
                i++;
            }
        }
        while(l < leftSize){
            array[i] = leftArray[l];
            l++;
            i++;
        }
        while(r < rightSize){
            array[i] = rightArray[r];
            r++;
            i++;
        }
    }
    
}
