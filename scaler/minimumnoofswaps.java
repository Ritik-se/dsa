public class Solution {
    public int solve(int[] A, int B) {
        // finding occurence 
        int size=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]<=B)
            {
                size++;//On

            }
        }
        int count=0;
        for(int i=0;i<size;i++)
        {
           if(A[i]<=B)
            {
                count++;//Os likely elemnts

            }
            
        }
        int ans=count;
        int start=1;
        int end=size;
        while(end<A.length)
        {
            if(A[start-1]<=B)
            {
                count--;
            }
            if(A[end]<=B)
            {
                count++;
            }
            ans=Math.max(ans,count);
            start++;
            end++;
            

        }
        return size-ans;

    }
}
