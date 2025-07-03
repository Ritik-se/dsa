//https://www.scaler.com/academy/mentee-dashboard/class/34609/assignment/problems/27560?navref=cl_tt_nv
public public class Solution {

    public int DecimalToAnyBase(int A, int B) {
        int ans = 0;
        int power = 1;
        while (A > 0) {
            ans = ans + (power * (A % B));
            A = A / B;
            power = power * 10;

        }
        return ans;
    }
}
{
    
}
