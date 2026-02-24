// Selection Sort implementation to arrange an integer array in ascending order and print the sorted output.

public class SelectionSort {
        public static void main(String[] args) {
        
        int[] array = {3,2,4,1,6,7,5};

        selectionSort(array);

        for(int i=0; i<array.length ; i++){
            if(i == array.length-1){
                System.out.print(array[i]);
            }
            else{
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static void selectionSort(int[] array){

        for(int i=0 ; i<array.length-1 ; i++){
            int min = i;

            for(int j=i+1 ; j<array.length ; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
