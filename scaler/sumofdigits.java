
public public class Solution {

    int ans = 0;

    public int sum(int a) {
        if (a == 0) {
            return 0;
        }
        return a % 10 + sum(a / 10);

    }

    public int solve(int A) {
        return sum(A);// return sum

    }
}
{
    
}
