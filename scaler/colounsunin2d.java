//https://www.scaler.com/academy/mentee-dashboard/class/34605/assignment/problems/11433/submissions

public class Solution {

    public int[] solve(int[][] A) {
        int sum;
        int n = A.length;
        int m = A[0].length;
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += A[j][i];

            }
            ans[i] = sum;

        }
        return ans;
    }

}
