public class Solution {
    public int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        // building of prefix sum
        int[][] arr=new int[A.length][A[0].length];
         int[] res=new int[B.length];
         arr[0][0]=A[0][0];
       for(int j=1; j<A[0].length; j++) {
    arr[0][j] = arr[0][j-1] + A[0][j];
}
for(int i=1; i<A.length; i++) {
    arr[i][0] = arr[i-1][0] + A[i][0];
}
for(int i=1;i<A.length;i++)
{
    for(int j=1;j<A[0].length;j++)
    {
        arr[i][j]=arr[i][j-1]+arr[i-1][j]-arr[i-1][j-1]+A[i][j];
    }
}
       
       
        long sum=0;
        for(int i=0;i<B.length;i++)
        {
           int tlr=B[i]-1;
             int tlc=C[i]-1;
            int brr=D[i]-1;
            int brc=E[i]-1;
            if(tlr==0&&tlc==0)
            {
                  sum=(arr[brr][brc])%1000000007;
            }

            else if(tlr==0)
            {
                 sum=(arr[brr][brc]-arr[brr][tlc-1])%1000000007;
            }
            else if(tlc==0)
            {
                 sum=(arr[brr][brc]-arr[tlr-1][brc])%1000000007;
            }
            else{
            sum=(arr[brr][brc]-arr[brr][tlc-1]-arr[tlr-1][brc]+arr[tlr-1][tlc-1])%1000000007;
            }
           res[i]=(int)sum%1000000007;
        }
        return res;
    }
}

