public class Solution {
    public int solve(int[] A, int B) {
        int curr=0;
        for(int i=0;i<B;i++)
        {
            curr+=A[i];
        }
        int max=curr;
        int rem=B-1,add=A.length-1;
        while(rem>=0&&add>=0)// adding and removing of elements
        {
            curr+=A[add--];
            curr-=A[rem--];
            max=Math.max(max,curr);
        }
        return max;
    }
}
