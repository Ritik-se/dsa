https
://www.scaler.com/academy/mentee-dashboard/class/34607/assignment/problems/4256/submissions
public public class Solution {

    public int solve(String A) {
        int count = 0, ans = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '1') {
                count++;
            }
        }
        if (count == A.length()) {
            return count;
        }
        if (count == 0) {
            return 0;
        }
        for (int i = 0; i < A.length(); i++) {
            int suml = 0, sumr = 0;
            if (A.charAt(i) == '0') {
                for (int j = i - 1; j >= 0 && A.charAt(j) == '1'; j--) {
                    suml++;
                }
                for (int j = i + 1; j < A.length() && A.charAt(j) == '1'; j++) {
                    sumr++;
                }
            }
            if (ans < suml + sumr + 1) {
                ans = suml + sumr + 1;
            }

        }
        if (ans < count) {
            return ans;
        } else {
            return count;
        }
    }
}
{
    
}
