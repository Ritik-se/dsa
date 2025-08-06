
public class Solution {

    public int solve(int A, int B, int C) {
        long ans = 1;
        for (int i = B; i >= 1; i--) {
            ans = ((ans % C) * (A % C)) % C;
        }
        return (int) ans % C;
    }
}
