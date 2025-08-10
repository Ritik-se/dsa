
public public class Solution {

    public int solve(int A, int B) {
        if (A == 0) {
            return 0;
        }
        int parent = solve(A - 1, (B + 1) / 2);
        if (B % 2 == 0) {
            return parent ^ 1; 
        }else {
            return parent;
        }
    }
}
{
    
}
