https
://www.scaler.com/academy/mentee-dashboard/class/34606/assignment/problems/4033?navref=cl_tt_nv
public class Solution {

    public int[][] generateMatrix(int A) {
        int last = A * A;
        int[][] ans = new int[A][A];
        int row = 0;
        int coloum = 0;
        int count = 1;
        int size = A;
        while (A >= 1) {
            for (int i = 1; i < A; i++) {
                ans[row][coloum] = count;
                coloum++;
                count++;
            }
            for (int i = 1; i < A; i++) {
                ans[row][coloum] = count;
                row++;
                count++;
            }
            for (int i = 1; i < A; i++) {
                ans[row][coloum] = count;
                coloum--;
                count++;
            }
            for (int i = 1; i < A; i++) {
                ans[row][coloum] = count;
                row--;
                count++;
            }
            row++;
            coloum++;
            A -= 2;

        }
        if ((size % 2) != 0) {
            ans[size / 2][size / 2] = count;
        }
        return ans;

    }
}
