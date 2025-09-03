
public public class Solution {

    public int solve(int[][] A, int B) {
        int[][] ps = new int[A.length][A.length];
        ps[0][0] = A[0][0];
        for (int i = 1; i < A.length; i++) {
            ps[0][i] = ps[0][i - 1] + A[0][i];
        }
        for (int i = 1; i < A.length; i++) {
            ps[i][0] = ps[i - 1][0] + A[i][0];
        }
        for (int i = 1; i < A.length; i++) {
            for (int j = 1; j < A.length; j++)// basically a sliding window approach 
            {
                ps[i][j] = ps[i - 1][j] + ps[i][j - 1] - ps[i - 1][j - 1] + A[i][j];
            }
        }
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i + B - 1 < A.length; i++) {// siliding the window 
            for (int j = 0; j + B - 1 < A.length; j++) {
                int r1 = i, c1 = j; // top left
                int r2 = i + B - 1, c2 = j + B - 1;// bottom right 
                int sum = ps[r2][c2];
                if (r1 > 0) {
                    sum -= ps[r1 - 1][c2];
                }
                if (c1 > 0) {
                    sum -= ps[r2][c1 - 1];
                }
                if (r1 > 0 && c1 > 0) {
                    sum += ps[r1 - 1][c1 - 1];
                }
                maxsum = Math.max(maxsum, sum);
            }
        }
        return maxsum;

    }
}
{
    
}
