import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {
        

        String s = "aabacbebebe";
        int k = 3;
        int maxLength = Integer.MIN_VALUE;

        HashMap<Character, Integer> freq = new HashMap<>();
        int left = 0;

        for(int right=0 ; right<s.length() ; right++){

            char rightChar = s.charAt(right);
            freq.put(rightChar, freq.getOrDefault(rightChar,0)+1);

            while(freq.size() > k){

                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);

                if(freq.get(leftChar) == 0){
                    freq.remove(leftChar);
                }
                left++;
            }

            maxLength = right-left+1>maxLength ? right-left+1 : maxLength;
        }

        System.out.println(maxLength);
    }
}
