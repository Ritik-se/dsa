//https://www.scaler.com/academy/mentee-dashboard/class/34608/assignment/problems/2/submissions

public public class Solution {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int majorityElement(final int[] A) {
        int me = A[0];
        int count = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] == me) {
                count++;
            } else {
                if (count == 0) {
                    me = A[i];
                    count++;
                } else {
                    count--;
                }
            }

        }
        return me;
    }

}
{
    
}
