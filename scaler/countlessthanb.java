https
://www.scaler.com/academy/mentee-dashboard/class/34604/assignment/problems/16089/submissions
public class Solution {

    public int solve(int[] A, int B) {

        int sum, count = 0;
        for (int i = 0; i < A.length; i++) {
            sum = 0;

            for (int j = i; j < A.length; j++) {
                sum += A[j];

                if (sum < B) {
                    count++;
                }
            }
        }
        return count;

    }
}
