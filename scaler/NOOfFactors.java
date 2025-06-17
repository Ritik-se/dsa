// https://www.scaler.com/academy/mentee-dashboard/class/34598/assignment/problems/29028/submissions//

public class Solution {

    int count;

    public int solve(int A) {
        for (int i = 1; i <= A; i++) {
            if (A % i == 0) {
                count++;
            }
        }
        return count;
    }
}
