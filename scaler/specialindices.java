//
//https://www.scaler.com/academy/mentee-dashboard/class/34608/assignment/problems/12828?navref=cl_tt_nv
// care fully 
public public class Solution {

    public int solve(int[] A) {
        int[] oddps = new int[A.length];
        int[] evenps = new int[A.length];
        oddps[0] = 0;
        //test
        evenps[0] = A[0];
        // special indeices means sum of even and odd should be equal
        int sumodd, sumeven, count = 0;
        for (int i = 1; i < A.length; i++) {
            if (i % 2 == 0) {
                evenps[i] = evenps[i - 1] + A[i];
                oddps[i] = oddps[i - 1];
            } else {
                oddps[i] = oddps[i - 1] + A[i];
                evenps[i] = evenps[i - 1];
            }

        }
        for (int i = 0; i < A.length; i++) {
            sumodd = 0;
            sumeven = 0;
            if (i == 0) {
                sumeven = oddps[A.length - 1] - oddps[i];

                sumodd = evenps[A.length - 1] - evenps[i];
            } else {
                sumeven = evenps[i - 1] + oddps[A.length - 1] - oddps[i];

                sumodd = oddps[i - 1] + evenps[A.length - 1] - evenps[i];
            }
            if (sumeven == sumodd) {
                count++;
            }

        }
        return count;

    }
}
{
    
}
