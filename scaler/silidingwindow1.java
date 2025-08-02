//https://www.scaler.com/academy/mentee-dashboard/class/34606/assignment/problems/30351/submissions

public public class Solution {

    public int solve(int[] A, int B, int C) {
        int tsum = 0;
        for (int i = 0; i < B; i++) {
            tsum += A[i];

        }
        if (tsum == C) {
            return 1;
        }
        int s = 1;
        int e = B;
        while (e < A.length) {
            tsum = tsum - A[s - 1] + A[e];
            if (tsum == C) {
                return 1;
            }
            s++;
            e++;
        }
        return 0;
    }
}
{
    
}
