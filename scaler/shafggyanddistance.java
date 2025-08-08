
import java.util.ArrayList;
import java.util.HashMap;

public public class Solution {

    public int solve(ArrayList<Integer> A) {
        if (A.size() == 1) {
            return -1;
        }
        // stores <Value, Index> pair
        HashMap< Integer, Integer> map = new HashMap< Integer, Integer>();
        int result = A.size();
        for (int i = 0; i < A.size(); i++) {
            if (map.containsKey(A.get(i))) {
                result = Math.min(result, i - map.get(A.get(i)));
            }
            map.put(A.get(i), i);
        }
        if (result == A.size()) {
            return -1;
        }
        return result;

    }
}
