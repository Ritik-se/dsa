\\https

://www.scaler.com/academy/mentee-dashboard/class/34601/assignment/problems/11554/submissions
public class Solution {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] a) {
        int i = 0, temp;
        int j = a.length - 1;
        // using 3rd variable 
        while (i < j) {
            temp = a[j];
            a[j] = a[i];
            a[i] = temp;
            i++;
            j--;
        }
        return a;

    }
}
