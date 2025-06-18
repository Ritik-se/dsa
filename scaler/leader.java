//https://www.scaler.com/academy/mentee-dashboard/class/34603/assignment/problems/11921/submissions

public class Solution {

    public int[] solve(int[] A) {
        int n = A.length;
        int count = 0;

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            boolean p = true;
            for (int j = i + 1; j < n; j++) {
                if (A[i] <= A[j]) {
                    p = false;
                    break;

                }

            }

            if (p == true) {
                ans[count] = A[i];
                count++;
            }
        }
        int[] result = new int[count];
        for (int k = 0; k < count; k++) {
            result[k] = ans[k];
        }

        return result;
    }
}
