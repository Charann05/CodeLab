package DynamicArray;

public class TestDA {
    public static void main(String[] args) {
        
        DynamicArray da = new DynamicArray();

        System.out.println("Intial capacity : "+da.capacity);
        da.add("A");
        da.add("B");
        da.add("C");

        System.out.println("Empty? : "+da.isEmpty());

        da.add("D");
        da.add("E");
        da.add("F");
        da.insert(1, "G");
        System.out.println(da);

        da.delete("D");
        System.out.println(da);

        System.out.println("Position of B : "+da.search("B"));
        da.delete("F");
        da.delete("E");
        da.delete("A");
        da.delete("G");
        System.out.println(da);
    }
}
