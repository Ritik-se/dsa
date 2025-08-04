//https://www.scaler.com/academy/mentee-dashboard/class/34608/assignment/problems/2/submissions

public class Solution {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int majorityElement(final int[] A) {
        int me = A[0];
        int count = 0;
        //majority element moores voting algorithim

        for (int i = 0; i < A.length; i++) {
            if (A[i] == me) {
                count++;
            } else if (A[i] != me && count > 0) {
                count--;
            } else {
                me = A[i];
                count = 1;
            }
        }
        return me;
    }
}
