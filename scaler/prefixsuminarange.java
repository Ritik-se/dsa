//https://www.scaler.com/academy/mentee-dashboard/class/34602/assignment/problems/15991/submissions
//brute force

public class Solution {

    public long[] rangeSum(int[] A, int[][] B) {
        int n = B.length;
        long[] res = new long[n];
        for (int i = 0; i < B.length; i++) {
            int sum = 0;
            int L = B[i][0];
            int R = B[i][1];
            for (int j = L; j <= R; j++) {
                sum = sum + A[j];

            }
            res[i] = sum;

        }
        return res;

    }
}

// optimized approach
public class Solution {

    public long[] rangeSum(int[] A, int[][] B) {
        int n = B.length;
        long[] res = new long[n];
        int[] ps = new int[A.length];
        ps[0] = A[0];
        for (int k = 1; k < A.length; k++) {
            ps[k] = ps[k - 1] + A[k];
        }
        for (int i = 0; i < B.length; i++) {
            int L = B[i][0];
            int R = B[i][1];
            if (L != 0) {
                res[i] = ps[R] - ps[(L - 1)];

            } else {
                res[i] = ps[R];
            }
        }
        return res;

    }
}
