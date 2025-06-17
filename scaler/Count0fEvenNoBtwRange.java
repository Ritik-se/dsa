//https://www.scaler.com/academy/mentee-dashboard/class/34602/assignment/problems/26546?navref=cl_tt_nv

public class Solution {

    public int[] solve(int[] A, int[][] B) {
        int n = A.length;
        int n1 = B.length;
        int sum;
        int[] even = new int[n];
        int[] res = new int[n1];
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                even[i] = 1;
            } else {
                even[i] = 0;
            }

        }
        for (int i = 0; i < n1; i++) {
            int s = B[i][0];
            int e = B[i][1];
            sum = 0;

            for (int j = s; j <= e; j++) {
                sum += even[j];

            }
            res[i] = sum;
        }
        return res;

    }
}
