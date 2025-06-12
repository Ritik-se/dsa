//https://www.scaler.com/academy/mentee-dashboard/class/34598/assignment/problems/11259/?navref=cl_pb_nv_tb

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int power(final int A, final int B) {
        int mult = 1;
        for(int i=0;i<B;i++){
            mult = mult * A;
        }
        return mult;
    }
}
