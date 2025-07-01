//https://www.scaler.com/academy/mentee-dashboard/class/34607/assignment/problems/4256?navref=cl_tt_nv
public public class Solution {
    public int solve(String A) {
        int count=0,result=0;
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)=='1')
            {
                count++;
            }
        }
        if(count==0)
        {
            return 0;
        }
        else if(count==A.length())
        {
            return A.length();
        }
    
     for(int i=0;i<A.length();i++){
         int r=0,l=0;
         if(A.charAt(i)=='0')
         {
             if(i!=0)
             {
                 for(int j=i-1;j>=0;j--)
                 {
                     if(A.charAt(j)!='0'){
                         l++;
                     }
                     else{
                         break;
                     }
                 }
             }
             if(i!=A.length()-1)
             {
                 for(int j=i+1;j<A.length();j++)
                 {
                     if(A.charAt(j)!='0'){
                         r++;
                     }
                     else{
                         break;
                     }
                 }
             }
             if(result<r+l)
             {
                 result=r+l;
             }

         }


       }
       if(result==count){
           return result;
       }
       else{
           return result+1;
       }
       
  } 

}
 {
    
}
