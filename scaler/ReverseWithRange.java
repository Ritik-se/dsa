https
://www.scaler.com/academy/mentee-dashboard/class/34601/assignment/problems/29129/submissions
public class Solution {

    public int[] solve(int[] a, int B, int C) {
        int i = B, j = C, temp;
        // it also from 
        //
        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return a;

    }
}
