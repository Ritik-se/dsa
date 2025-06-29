//https://www.scaler.com/academy/mentee-dashboard/class/34605/assignment/problems/11465?navref=cl_tt_nv

public class Solution {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i][i];
        }
        return sum;
    }
}
