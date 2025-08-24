public public class Solution {
    public int solve(int[][] A) {
   // in this we use contribution technique 
       int sum=0;
     for(int i=0;i<A.length;i++)
     {
         for(int j=0;j<A.length;j++)
         {
             int tl=(i+1)*(j+1);
             int br=(A.length-i)*(A.length-j);
             int count=tl*br;
             sum+=A[i][j]*count;

         }
     }
     return sum;
    }
}
x {
    
}
