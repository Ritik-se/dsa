
public class Solution {

    public int solve(int A) {
        int sum = 0;
        for (int i = 1; i <= A; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }

        }
        return sum;
        // returning sum
    }
}
