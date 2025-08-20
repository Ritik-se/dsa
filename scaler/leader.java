//https://www.scaler.com/academy/mentee-dashboard/class/34603/assignment/problems/11921/hints?navref=cl_pb_nv_tb

public class Solution {
    // no of leaders in array

    public int[] solve(int[] A) {
        int max = A[A.length - 1];
        int count = 0;
        int[] ans = new int[A.length];
        ans[count++] = max;
        for (int i = A.length - 2; i >= 0; i--) {
            if (A[i] > max) {
                ans[count++] = A[i];
                max = A[i];
            }

        }
        int[] res = new int[count];
        for (int i = 0; i < count; i++) {
            res[i] = ans[i];
        }
        return res;
    }
}
