// /https://www.scaler.com/academy/mentee-dashboard/class/34609/homework/problems/17868/submissions

public class Solution {

    public long solve(int A, int[] B) {
        long ans = 0;

        int sub = 0;
        int countzero = 0;
        for (int i = 0; i < A; i++) {
            if (B[i] == 0) {
                countzero++;
            } else {
                sub += (countzero * (countzero + 1)) / 2;
                countzero = 0;

            }
        }
        //for ending zero there are no 1 element so we cont sub
        sub += (long) (countzero * (countzero + 1)) / 2;
        ans = (long) (A * (A + 1) / 2) - sub;
        return (long) ans;

    }
}
