
public public class Solution {

    public void solve(int[][] A) {
        int n = A.length;

        // Step 1: Transpose matrix (swap A[i][j] with A[j][i])
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = A[i][left];
                A[i][left] = A[i][right];
                A[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
{
    
}
