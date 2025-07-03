//https://www.scaler.com/academy/mentee-dashboard/class/34609/assignment/problems/27470?navref=cl_tt_nv

public public class Solution {

    public int solve(int A, int B) {
        int dec = 0;
        int basepower = 1;

        while (A > 0) {
            int digits = A % 10;
            dec = dec + (digits * basepower);
            A = A / 10;
            basepower = basepower * B;

        }
        return dec;
    }
}
{
    
}
