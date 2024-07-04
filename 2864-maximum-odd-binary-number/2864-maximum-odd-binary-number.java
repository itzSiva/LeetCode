class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one=0;
        int zero=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1')
             one++;
            else
             zero++;
        }
        String ans="";
        while(one>1){
            ans+='1';
            one--;
        }
        while(zero>0){
            ans+='0';
            zero--;
        }
        if(one==1)
         ans+='1';
        return ans;

    }
}