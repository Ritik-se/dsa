//https://www.scaler.com/academy/mentee-dashboard/class/34601/homework/problems/9003/submissions

public class Solution {

    public int solve(int[] a) {
        int max = a[0];
        int count = 0;
        int sub = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }
        for (int i = 0; i < a.length; i++) {
            sub = max - a[i];
            count = count + sub;

        }
        return count;
    }
}
