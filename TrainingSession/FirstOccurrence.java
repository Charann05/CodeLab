public class FirstOccurrence {
    public static void main(String[] args) {
        int[] a = {1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,4,5,5,5,5,6,6,7,8,8,9};

        // int m = a.length / 2;
        int l = 0;
        int u = a.length-1;
        int key = 1;
        int index = -1;

        while(l <= u){
            int m = (l + u) / 2;
            
            if(key == a[m]){
                index = m;
                u = m - 1;
            }
            else if(key > a[m]){
                l = m + 1;
            }
            else {
                u = m - 1;
            }

        }
        System.out.println(index);
    }
}
