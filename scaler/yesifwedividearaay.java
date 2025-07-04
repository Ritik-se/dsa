//https://www.scaler.com/academy/mentee-dashboard/class/34603/homework/problems/1176?navref=cl_tt_nv

public public class Solution {

    public String solve(int[] A) {
        int n = A.length;
        if (n % 2 != 0 || A[0] % 2 != 0 || A[n - 1] % 2 != 0) {
            return "NO";
        } else {
            return "YES";
        }
    }
}
{
    
}
