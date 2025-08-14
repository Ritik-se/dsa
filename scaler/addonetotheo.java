public class Solution {
    public int[] plusOne(int[] A) {
        int n=A.length;
       
            for(int i=n-1;i>=0;i--)
            {
                if(A[i]!=9)
                {
                    A[i]+=1;
                  break;
                }
                else
                {
                    A[i]=0;
                }
                

            }
            int i=0;
        while(i<n&&A[i]==0)
            {i++;}
            
            if(i==n)
            {
                int[] arr=new int[n+1];
                arr[0]=1;
                return arr;
            }
            else{
                if(i>0)
                {

                int[] arr=new int[n-i];
                for(int j=0;j<arr.length;j++)
                {
                    arr[j]=A[i+j];

                }
                return arr;

                }
                
            }
            return A;
           

            
            
            
        }
    }


    