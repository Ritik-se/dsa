//https://www.scaler.com/academy/mentee-dashboard/class/34604/homework/problems/1054?navref=cl_tt_nv    
public class Solution {
    public int solve(String A) {
        int count=0;
        for(int i=0;i<A.length();i++)
        {
            char ch=A.charAt(i);
                
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                {
                    count=count+A.length()-i;;

                }
             }  
        
        return count;

    }
}
