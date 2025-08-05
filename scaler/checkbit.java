
public public class Solution {

    public int solve(int A, int B) {
        A = A >> B;
        if ((A & 1) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
{
    
}
