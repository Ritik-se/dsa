
public class Solution {
    //swapping along digonal of an element 

    public int[][] solve(int[][] a) {
        int m = a.length;
        int n = a[0].length;

        int[][] result = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = a[i][j];
            }

        }
        return result;
    }
}
