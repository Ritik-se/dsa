
public class Solution {

    public boolean palindromeCheck(String s) {
        return palindrome(s, 0, s.length() - 1);

        //your code goes here
    }

    public boolean palindrome(String n, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (n.charAt(left) != n.charAt(right)) {
            return false;
        }
        return palindrome(n, left + 1, right - 1);

    }
}
{
    
}
