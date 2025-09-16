
public class Solution {

    int sum = 0;

    public int NnumbersSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + NnumbersSum(n - 1);

    }
}
{
    
}
