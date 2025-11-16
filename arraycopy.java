//This program copies the elements of array 'a' into array 'b'.

package Java_Samples;

public class arraycopy {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6};
        int[] b = new int[a.length];

        System.out.println("Elements of array b before copying : ");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

        for(int i=0;i<a.length;i++){
            b[i] = a[i];
        }
        
        System.out.println("Elements of array b after copying : ");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
