
public class Solution {

    public int solve(int[] A) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < A.length; i++) {

            hs.merge(A[i], 1, Integer::sum);

        }
        for (int i = 0; i < A.length; i++) {
            if (hs.get(A[i]) > 1) {
                return A[i];
            }
        }
        return -1;
    }
}
