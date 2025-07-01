
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] solve(int[] A) {

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                for (int j = i - 1; j >= 0; j--) {
                    arr.clear();
                    if (A[j] > 0) {
                        arr.add(A[j])
                    } else {
                        break;
                    }
                }
                for (int j = i + 1; j >= A.length; j++) {
                    if (A[j] > 0) {
                        arr.add(A[j])
                    } else {
                        break;
                    }
                }
                if (ans.length < arr.length) {

                    ans = arr;

                }
            }

        }
    }
}
