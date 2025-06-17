
public class Solution {

    public int solve(int A) {
        for (int i = 1; i <= A; i++) {
            if (i * i == A) {
                return i;
            }
        }
        return -1;
    }
}
