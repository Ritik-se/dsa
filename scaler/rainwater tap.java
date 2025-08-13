
public class Solution {

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int trap(final List<Integer> A) {
        int[] lmax = new int[A.size()];
        int max1 = 0;
        int[] rmax = new int[A.size()];

        int max2 = 0;
        for (int i = 0; i < A.size(); i++) {
            max1 = Math.max(max1, A.get(i));
            lmax[i] = max1;

        }
        for (int i = lmax.length - 1; i >= 0; i--) {
            max2 = Math.max(max2, A.get(i));
            rmax[i] = max2;

        }
        int ans = 0;
        for (int i = 0; i < rmax.length; i++) {
            ans += Math.min(rmax[i], lmax[i]) - A.get(i);

        }
        return ans;
    }
}
