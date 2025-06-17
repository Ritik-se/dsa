//https://www.scaler.com/academy/mentee-dashboard/class/34601/assignment/problems/11160/submissions

public class Solution {

    public int solve(int[] A, int B) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] + A[j] == B) {
                    return 1;
                }
            }

        }
        return 0;
    }
}
//or 

public class Solution {

    public int solve(int[] A, int B) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i] + A[j] == B) {
                    return 1;
                }
            }

        }
        return 0;
    }
}
