//https://www.scaler.com/academy/mentee-dashboard/class/34601/assignment/problems/29098?navref=cl_tt_nv

public class Solution {

    public int[] solve(int[] a, int B) {
        B = B % a;//value greater than n
        // its classic problem 
        // rev then rev then rev

        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            int temp;
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;

        }
        for (int i = 0, j = B - 1; i < j; i++, j--) {
            int temp;
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;

        }
        for (int i = B, j = a.length - 1; i < j; i++, j--) {
            int temp;
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;

        }
        return a;

    }
}
