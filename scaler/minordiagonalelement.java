//https://www.scaler.com/academy/mentee-dashboard/class/34605/assignment/problems/11466/submissions

public class Solution {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {
        int sum = 0;
        int n = A.length;
        for (int i = 0; i < n; i++) {
            sum += A[i][n - 1 - i];//imp for j

        }
        return sum;
    }

}
