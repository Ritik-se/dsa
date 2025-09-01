public public class Solution {
    public int numSetBits(int A) {
        int count=0,set=0;
        for(int i=1;i<=32;i++)
        {
            set=(A>>i)&1;
            if(set==1)
            {
                count++;
            }
        }
        return count;
    }
}
 {
    
}
