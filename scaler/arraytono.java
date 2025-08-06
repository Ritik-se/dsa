
public class Solution {

    public long solve(int[] A, int B) {
        long pow = 1;
        long ans = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            ans += ((A[i] % B) * pow) % B;
            pow = (pow * 10) % B;
        }
        return ans % B;
    }
}
