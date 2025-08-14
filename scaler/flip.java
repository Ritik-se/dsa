
public public class Solution {

    public int[] flip(String A) {
        int[] arr = new int[A.length()];
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '1') {
                arr[i] = -1;
            }
            if (A.charAt(i) == '0') {
                arr[i] = 1;
            }
        }
        int max = 0, curr = 0, start = -1, end = -1, temp = 0;
        for (int i = 0; i < A.length(); i++) {
            if (curr < 0) {
                curr = 0;
                temp = i;

            }
            curr = curr + arr[i];

            if (curr > max) {
                max = curr;
                end = i;
                start = temp;
            }
        }
        if (start == -1) {
            return new int[]{};
        } else {
            return new int[]{start + 1, end + 1};
        }
    }

}
