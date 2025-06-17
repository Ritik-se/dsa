
https://www.scaler.com/academy/mentee-dashboard/class/34601/homework/problems/16497/submissionspublic class Solution {
    public int solve(int[] a, int b) {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(b==a[i])
            {
                count++;
            }


        }
        return count;
    }
}
