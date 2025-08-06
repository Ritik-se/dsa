public 

import java.util.*;
public class Solution {

    public int solve(int[] A) {
        Arrays.sort(A);
        int diff = A[1] - A[0];
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i + 1] - A[i] != diff) {
                return 0;
            }
        }
        return 1;
    }

}
{
    
}
