
public public class Solution {

    public int solve(int[] A, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int ps = 0, maxLen = 0;

        map.put(0, -1); // base case

        for (int i = 0; i < A.length; i++) {
            ps += A[i];

            if (map.containsKey(ps - k)) {
                maxLen = Math.max(maxLen, i - map.get(ps - k));
            }

            if (!map.containsKey(ps)) {
                map.put(ps, i); // store only first occurrence
            }
        }

        return maxLen;
    }
}
ksum {
    
}
