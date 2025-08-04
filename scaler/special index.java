//https://www.scaler.com/academy/mentee-dashboard/class/34608/assignment/problems/12828/submissions

public class Solution {

    public int solve(int[] A) {
        int[] pse = new int[A.length];
        int[] pso = new int[A.length];
        pso[0] = 0;
        pse[0] = A[0];
        int count = 0;
        for (int i = 1; i < A.length; i++) {
            if (i % 2 == 0) {
                pso[i] = pso[i - 1];
            } else {
                pso[i] = pso[i - 1] + A[i];

            }
        }
        for (int i = 1; i < A.length; i++) {
            if (i % 2 != 0) {
                pse[i] = pse[i - 1];
            } else {
                pse[i] = pse[i - 1] + A[i];

            }
        }
        for (int i = 0; i < A.length; i++) {
            if (i <= 0) {
                int sum0 = pse[A.length - 1] - pse[i];
                int sume = pso[A.length - 1] - pso[i];
                if (sum0 == sume) {
                    count++;
                }
            } else {
                int sum0 = pso[i - 1] + pse[A.length - 1] - pse[i];
                int sume = pse[i - 1] + pso[A.length - 1] - pso[i];
                if (sum0 == sume) {
                    count++;
                }

            }
        }
        return count;

    }
}
