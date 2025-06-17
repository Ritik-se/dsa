
public class Solution {

    public int solve(int A) {
        int count = 0;
        for (int i = 2; i <= A; i++)// we start from i=2 because 1 is neither prime or composite
        {
            int factors = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    factors++;
                }
            }
            if (factors == 2) {
                count++;
            }

        }
        return count;
    }
}
