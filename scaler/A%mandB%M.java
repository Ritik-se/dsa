public class Solution {
    public int solve(int A, int B) {
    int max=Math.max(A,B);
    int min=Math.min(A,B);
    int diff=max-min,ans=1;
    for(int i=1;i*i<=diff;i++)
    {
        if(diff%i==0)
        {
          if(ans<i)
          {
              ans=i;
          }

        }
        if(ans<(diff/i))
        {
            ans=diff/i;
        }
    }
    return ans;

    

    }
}
