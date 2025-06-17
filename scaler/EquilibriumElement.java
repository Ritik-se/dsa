//
//https://www.scaler.com/academy/mentee-dashboard/class/34602/assignment/problems/12826/submissionspublic class Solution {
    public int solve(int[] A) {
        int n=A.length;
        int[] ps=new int[n];
        ps[0]=A[0];
        int sl=0,sr=0;
        for(int i=1;i<n;i++)
        {
            ps[i]=ps[i-1]+A[i];
        }
        for(int j=0;j<A.length;j++)
        {
            if(j!=0){
            sl=ps[j-1];
            }
            sr=ps[n-1]-ps[j];
        if(sl==sr)
        {
            return j;
        }
        }
        return -1;
    }
}
