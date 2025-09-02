
public public class Solution {

    int ans = 0;

    public int setbit(int a, int i) {

        return a | 1 << i;
    }

    public int checkbit(int a, int i) {

        return (a >> i) & 1;
    }

    public int singleNumber(final int[] A) {

        for (int i = 0; i <= 31; i++) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if (checkbit(A[j], i) == 1) {
                    count++;
                }
            }
            if (count % 3 != 0) {
                ans = setbit(ans, i);

            }
        }
        return ans;

    }
}
{
    
}
