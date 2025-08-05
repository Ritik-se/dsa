
public class Solution {

    public int solve(int A, int B) {
        int num = 1;
        num = num << B;
        if ((A & num) > 0) {
            return A - num;
        }
        return A;

    }
}
