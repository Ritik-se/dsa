//https://www.scaler.com/academy/mentee-dashboard/class/34604/homework/problems/14363/submissions   

public class Solution {

    public long subarraySum(int[] A) {
        int n = A.length;
        // contribution technique used to 
        //decrease complexity with the help single element contribution 
        int count = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            count = (i + 1) * (n - i);
            sum += (long) A[i] * count;
            

        }
        return sum;
    }
}
