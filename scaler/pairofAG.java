
public class Solution {

    public int solve(String A) {
        int ans = 0, counta = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'A') {
                counta++;
            } else {
                if (A.charAt(i) == 'G') {
                    ans += counta;

                }
            }

        }

        return ans % 1000000007;

    }

}
