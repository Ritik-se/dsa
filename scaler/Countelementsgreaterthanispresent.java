//http://scaler.com/academy/mentee-dashboard/class/34601/assignment/problems/29033/submissions
public class Solution {
    public int solve(int[] a) {
        int count=0,max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==max)
            {
                count++;
            }

        }
        
        return a.length-count;
    }
}
