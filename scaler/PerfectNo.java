
public class Solution {

    public int solve(int A) {
        int sum = 0;
        for (int i = 1; i < A; i++) // it will go from 1 to A-1
        {
            if (A % i == 0) {

                sum = sum + i;

            }

        }
        if (sum != A) {
            return 0;
        } else {
            return 1;
        }
    }

}
