public public class Solution {
    public int solve(int[] A) {
        int swaps=0;
        for(int i=0;i<A.length;)
        { int temp=0;
            if(A[i]!=i)
            {
                temp=A[i];
                A[i]=A[A[i]];
                A[temp]=temp;//ON
                swaps++;
      
                
            }
            if(A[i]==i)
            {
              i++;
            }
        }
        return swaps;
    }
}
 {
    
}
