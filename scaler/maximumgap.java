public public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] A) {
        int[] lmin= new int[A.length];
        int[] rmax= new int[A.length];
        lmin[0]=A[0];
        for(int i=1;i<A.length;i++)
        {
            lmin[i]=Math.min(lmin[i-1],A[i]);

        }
        int n=A.length;
        rmax[n-1]=A[n-1];
        for(int i=n-2;i>=0;i--)
        {
         rmax[i]=Math.max(rmax[i+1],A[i]);
            
        }
        int i=0,j=0;
        int gap=0;
        while(i<n&&j<n)
        {
            if(lmin[i]<=rmax[j])
            {
                 gap=Math.max(j-i,gap);
                j++;
            }
            else

            {
                i++;
            }
        }
        return gap;

    }
}
 {
    
}
