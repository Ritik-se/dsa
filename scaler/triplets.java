//https://www.scaler.com/academy/mentee-dashboard/class/34607/assignment/problems/27363?navref=cl_tt_nv
public public class Solution {
    public int solve(int[] A) {int result=0;
        for(int i=0;i<A.length;i++)
        { int r=0,l=0;
            for(int j=0;j<=i-1;j++)
            {
               if(A[j]<A[i])
               {
                  l++; 
               }
            }
            for(int j=i+1;j<A.length;j++)
            {
               if(A[j]> A[i])
               {
                  r++; 
               }
            }
            result+=r*l;

        }
        return result;
    }
}
 {
    
}
