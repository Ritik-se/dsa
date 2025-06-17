
public class Solution {

    public ArrayList<Integer> solve(int A) {
        ArrayList< Integer> ans = new ArrayList< Integer>();
        for (int i = 1; i <= A; i++) {
            int temp = i, sum = 0;
            while (temp > 0) {
                int dig = temp % 10;
                sum += (dig * dig * dig);
                temp /= 10;
            }
            if (sum == i) {
                ans.add(i);
            }
        }
        return ans;
    }
}
