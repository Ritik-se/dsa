// /https://www.scaler.com/academy/mentee-dashboard/class/34608/assignment/problems/26719/submissions

public public class Solution {

    public int[] solve(int[] A, int[][] B) {
        int[] ans = new int[B.length];
        int[] ps = new int[A.length];
        int sum, s = 0, e = 0;
        ps[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            if (i % 2 == 0) {
                ps[i] = ps[i - 1] + A[i];
            } else {
                ps[i] = ps[i - 1];
            }
        }// this is sum of all even indices  
        for (int i = 0; i < B.length; i++) {
            sum = 0;
            s = B[i][0];
            e = B[i][1];
            if (s == 0) {
                ans[i] = ps[e];
            } else {
                sum = ps[e] - ps[s - 1];
                ans[i] = sum;
            }

        }
        return ans;

    }
}
{
    
}
