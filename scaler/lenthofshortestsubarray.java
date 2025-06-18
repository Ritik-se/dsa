
//https://www.scaler.com/academy/mentee-dashboard/class/34603/assignment/problems/986/submissions
public class Solution {

    public int solve(int[] A) {
        int max = A[0], min = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];

            }
            if (A[i] < min) {
                min = A[i];

            }
        }
        int lminindex = -1;
        int lmaxindex = -1;
        int ans = Integer.MAX_VALUE;
        int ans1 = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == min) {
                lminindex = i;
                if (lmaxindex >= 0) {
                    ans1 = i - lmaxindex + 1;
                    if (ans > ans1) {
                        ans = ans1;
                    }

                }
            } else {
                if (A[i] == max) {
                    lmaxindex = i;
                    if (lminindex >= 0) {
                        ans1 = i - lminindex + 1;
                        if (ans > ans1) {
                            ans = ans1;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
