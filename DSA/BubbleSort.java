// Bubble Sort implementation to sort an integer array in ascending order and print the result.

public class BubbleSort {
    public static void main(String[] args) {
        
        int[] array = {3,2,4,1,6,7,5};

        bubbleSort(array);
        for(int i=0; i<array.length ; i++){
            if(i == array.length-1){
                System.out.print(array[i]);
            }
            else{
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static void bubbleSort(int[] array){

        for(int i=0 ; i<array.length-1 ; i++){
            for(int j=0 ; j<array.length-i-1 ; j++){

                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
