
public public class Solution {

    public int palindrome(int i, int j, String A) {
        if (i >= j) {
            return 1;
            // base condition
        }
        if (A.charAt(i) != A.charAt(j)) {// checks if char have been diffrent 
            return 0;
        }
        return palindrome(i + 1, j - 1, A);

    }

    public int solve(String A) {
        return palindrome(0, A.length() - 1, A);

    }
}
{
    
}
