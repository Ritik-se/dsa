
import java.util.ArrayList;
import java.util.HashMap;

public // Do not write code to include libraries, main() function or accept any input from the console.
// Initialization code is already written and hidden from you. Do not write code for it again.
public class Solution {

    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer, Integer> a = new HashMap<>();
        HashMap<Integer, Integer> b = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            a.put(A.get(i), a.getOrDefault(A.get(i), 0) + 1);
        }
        for (int i = 0; i < B.size(); i++) {
            b.put(B.get(i), b.getOrDefault(B.get(i), 0) + 1);
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int k : a.keySet()) {
            if (b.containsKey(k)) {
                int count = Math.min(a.get(k), b.get(k));
                for (int i = 0; i < count; i++) {
                    ans.add(k);
                }
            }

        }
        return ans;

    }
}
{
    
}
