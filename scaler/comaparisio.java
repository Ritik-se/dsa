//http://scaler.com/academy/mentee-dashboard/class/34605/homework/problems/11614/submissions

public class Solution {

    public int solve(int[][] A, int[][] B) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] != B[i][j]) {
                    return 0;
                }
            }

        }
        return 1;
    }
}
