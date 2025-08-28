//https://www.scaler.com/academy/mentee-dashboard/class/34603/assignment/problems/1247/submissions 
//brute force approach

public class Solution {

    public int solve(String A) {
        int ans = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'A') {
                for (int j = i + 1; j < A.length(); j++) {
                    if (A.charAt(j) == 'G') {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}

// optimized
public class Solution {

    public int solve(String A) {
        int ans = 0;
        int counta = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'A') {
                counta++;// before g how many a is occured in the array 
                
            } else if (A.charAt(i) == 'G') {
                ans += counta;
            }

        }
        return ans;
    }
}
