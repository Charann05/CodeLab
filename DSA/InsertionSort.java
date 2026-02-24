// Sorts an integer array in ascending order using the Insertion Sort algorithm.

public class InsertionSort {
            public static void main(String[] args) {
        
        int[] array = {3,2,4,1,6,7,5};

        insertionSort(array);

        for(int i=0; i<array.length ; i++){
            if(i == array.length-1){
                System.out.print(array[i]);
            }
            else{
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static void insertionSort(int[] array){

        for(int i=1 ; i<array.length ; i++){

            int temp = array[i];
            int j = i - 1;

            while((j >= 0) && (array[j] > temp)){
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = temp;
        }
    }
}
