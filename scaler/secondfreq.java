public import java.util.*;
class Solution {
    public int secondMostFrequentElement(int[] nums) {
      int result=Integer.MAX_VALUE;
      if(nums==null||nums.length==0) return -1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int smax=-1,max=-1;
       for(Map.Entry<Integer,Integer> entry:map.entrySet())
       {
        if(max<entry.getValue())
        {
            smax=max;
            max=entry.getValue();
        }
        else if(entry.getValue()>smax&&entry.getValue()<max)
        {
            smax=entry.getValue();
        }
       

       }
        if(smax==-1) return -1;
       for(Map.Entry<Integer,Integer> entry:map.entrySet())
       {
        if(entry.getValue()==smax)
        {
            result=Math.min(result,entry.getKey());
        }
       }
       return result;
       //second freq return


     
    }
}

 {
    
}
