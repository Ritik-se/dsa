
import java.util.ArrayList;
import java.util.HashSet;

public public class Solution {

    public int solve(ArrayList<Integer> A) {
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();

        for (int i = 0; i < A.size(); i++) {
            if (a.contains(A.get(i))) {
                b.add(A.get(i));
            } else {
                a.add(A.get(i));
            }
        }
        for (int i = 0; i < A.size(); i++) {
            if (b.contains(A.get(i))) {
                return A.get(i);
            }
        }
        return -1;

    }
}
{
    
}
