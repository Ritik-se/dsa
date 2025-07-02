//https://www.scaler.com/academy/mentee-dashboard/class/34608/homework/problems/67?navref=cl_tt_lst_sl

public class Solution {
    // DO NOT MODIFY THE LIST

    public int repeatedNumber(final int[] A) {
        int me1 = 0;
        int me2 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == me1) {
                count1++;

            } else if (A[i] == me2) {
                count2++;
            } else if (count1 == 0) {
                me1 = A[i];
                count1 = 1;
            } else if (count2 == 0) {
                me2 = A[i];
                count2 = 1;
            } else {
                count1--;
                count2--;

            }

        }
        int c1 = 0, c2 = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == me1) {
                c1++;
            } else if (A[i] == me2) {
                c2++;
            }
        }

        if (c1 > (A.length / 3)) {
            return me1;
        } else if (c2 > (A.length / 3)) {
            return me2;
        } else {
            return -1;
        }

    }
}
