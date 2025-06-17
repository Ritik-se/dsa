\\https

://www.scaler.com/academy/mentee-dashboard/class/34601/homework/problems/29090/submissions
public class Solution {

    public int solve(int[] a) {
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min + max;
    }
}
