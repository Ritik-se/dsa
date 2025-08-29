//https://www.scaler.com/academy/mentee-dashboard/class/34605/assignment/problems/11437/submissions

public class Solution {

    public int[] solve(int[][] A) {
        int m = A[0].length;
        int n = A.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += A[i][j];// sum of rows
            }
            ans[i] = sum;
        }
        return ans;
    }
}
