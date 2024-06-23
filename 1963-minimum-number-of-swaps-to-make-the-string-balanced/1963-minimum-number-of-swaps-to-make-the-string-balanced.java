class Solution {
    public int minSwaps(String s) {
        int n=s.length();
        int cnt=0,swap=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='[')
            cnt++;
            else cnt--;

            if(cnt==-1)
            {
                swap++;
                cnt+=2;
            }
        }
        return swap;
    }
}