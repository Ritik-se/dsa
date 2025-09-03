
int carry=0;
        for(int i=maxlength-1;i>=0;i--)
        {
            int bit1=0,bit2=0;
        if(A.charAt(i)==1)
        {
            bit1=1;
        }
        if(B.charAt(i)==1)
        {
            bit2=1;
        }
        int sum=bit1+bit2+carry;
        int result=sum%2;/// logic and easy 
         carry=sum/2;// considerd carry 
         ans.append(result);
