//https://www.scaler.com/academy/mentee-dashboard/class/34602/assignment/problems/29398/submissions

public class Solution {

    public int[] solve(int[] a) {
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i - 1] + a[i];
        }
        return a;
    }

}
