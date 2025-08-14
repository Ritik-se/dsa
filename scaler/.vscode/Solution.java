public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        if (A == null || A.size() == 0) return "";  // edge case
        String min=A.get(0);
        for(int i=0;i<A.size();i++){
            if(min.length()>A.get(i).length())
            {
                min=A.get(i);
            }

        }
        for(int i=0;i<min.length();i++)
        {
            for(int j=0;j<A.size();j++)
            {
                if(min.charAt(i)!=A.get(j).charAt(i))
                {
                    return min.substring(0,i);
                }
            }
        }
        return min;
    }
}
