//https://www.scaler.com/academy/mentee-dashboard/class/34604/assignment/problems/16094?navref=cl_tt_nv

public class Solution {

    public int solve(int[] A, int B) {
        int count = 0;
        int sum, length;
        for (int i = 0; i < A.length; i++) {
            sum = 0;
            length = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];
                length = j - i + 1;
                if (length % 2 == 0 && sum < B) {
                    count++;
                } else if (length % 2 != 0 && sum > B) {
                    count++;
                }

            }

        }
        return count;
    }

}
