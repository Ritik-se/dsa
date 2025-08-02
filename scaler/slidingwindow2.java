
https

://www.scaler.com/academy/mentee-dashboard/class/34606/assignment/problems/4033?navref=cl_tt_nv
public class Solution {

    public int solve(int[] A, int B) {
        int k = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= B) {
                k++;
            }
        }
        int bad = 0;
        for (int i = 0; i < k; i++) {
            if (A[i] > B) {
                bad++;

            }
        }
        int swap = bad;
        for (int i = 1, j = k; j < A.length; j++, i++) {

            if (A[i - 1] > B) {
                swap--;
            }
            if (A[j] > B) {
                swap++;
            }
            if (swap < bad) {
                bad = swap;
            }
        }
        return bad;

    }
}
