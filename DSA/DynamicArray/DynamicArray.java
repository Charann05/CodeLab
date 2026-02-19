// Custom implementation of a dynamic array without using inbuilt collections.

package DynamicArray;
public class DynamicArray {

    int size;
    int capacity = 5;
    Object[] array;

    public DynamicArray(){
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    public void add(Object data){
        if(size >= capacity){
            grow();
        }
        array[size] = data;
        size++;
    }
    public void insert(int index, Object data){
        if(size >= capacity){
            grow();
        }
        for(int i=size ; i>index ; i--){
            array[i] = array[i-1];
        }
        array[index] = data;
        size++;

    }
    public void delete(Object data){
        for(int i=0 ; i<size ; i++){
            if(array[i] == data){
                for(int j=0 ; j<(size-i-1) ; j++){
                    array[i + j] = array[i + j +1];
                }
                array[size - 1] = null;
                size--;
                if(size < (int)capacity/3){
                    shrink();
                }
                break;
            }
        }
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int search(Object data){
        for(int i=0 ; i<size ; i++){
            if(array[i] == data){
                return i;
            }
        }
        return -1;
    }
    public void grow(){
        capacity *= 2;
        Object[] newArray = new Object[capacity];

        for(int i=0 ; i<size ; i++){
            newArray[i] = array[i];
        }
        array = newArray;
        System.out.println("Capacity changed to : "+capacity);

    }
    public void shrink(){
        capacity = (int)capacity / 3;
                Object[] newArray = new Object[capacity];

        for(int i=0 ; i<size ; i++){
            newArray[i] = array[i];
        }
        array = newArray;
        System.out.println("Capacity changed to : "+capacity);
    }
    public String toString(){
        String s = "";
        for(int i=0 ; i<size ; i++){
            s += array[i] + ", ";
        }
        if(s != ""){
            s = "[" + s.substring(0 , (s.length() - 2)) + "]";
        }
        else{
            s = "[]";
        }
        return s;
    }
    
}
