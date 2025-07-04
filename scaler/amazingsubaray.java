//https://www.scaler.com/academy/mentee-dashboard/class/34603/homework/problems/1054/?navref=cl_pb_nv_tb

public class Solution {

    public int solve(String A) {
        int n = A.length();
        int sum = 0;
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                sum = (sum + n - i) % 10003;

            }

        }
        return sum;

    }
}
