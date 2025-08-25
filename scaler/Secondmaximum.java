//https://www.scaler.com/academy/mentee-dashboard/class/34601/homework/problems/11427?navref=cl_tt_nv

public class Solution {

    public int solve(int[] a) {
        int max = a[0];
        int smax = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                smax = max;
                max = a[i];
                // this case is imp because it goona tell us 
            } else if (a[i] > smax && a[i] != max) {
                smax = a[i];
            }

        }
        return smax;
    }
}
