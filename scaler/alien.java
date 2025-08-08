
import java.util.ArrayList;
import java.util.HashMap;

public public class Solution {

    public int solve(ArrayList<String> A, String B) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < B.length(); i++) {
            map.put(B.charAt(i), i);
        }
        for (int i = 0; i < A.size() - 1; i++) {
            String word = A.get(i);
            String word1 = A.get(i + 1);
            if (!inCorrectOrder(word, word1, map)) {
                return 0;

            }
        }
        return 1;
    }

    public boolean inCorrectOrder(String word1, String word2, HashMap<Character, Integer> map) {
        int len = Math.min(word1.length(), word2.length());
        for (int i = 0; i < len; i++) {
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);
            if (c1 != c2) {
                return map.get(c1) < map.get(c2);
            }
        }
        return word1.length() <= word2.length();
    }

}
