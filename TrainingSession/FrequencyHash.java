import java.util.HashMap;

public class FrequencyHash {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        String s = "Hello";

        for(int i=0 ; i<s.length() ; i++){

            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }

        // System.out.println(map);
        char c = 'l';
        System.out.println(map.get(c));
    }
}
