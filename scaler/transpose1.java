//https://www.scaler.com/academy/mentee-dashboard/class/34605/assignment/problems/11615/submissions

public class Solution {

    public int[][] solve(int[][] A) {
        int[][] ans = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                ans[j][i] = A[i][j];
            }

        }
        return ans;
    }
}
