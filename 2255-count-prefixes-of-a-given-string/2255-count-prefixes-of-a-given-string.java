class Solution {
    public int countPrefixes(String[] words, String s) {
        int n=s.length();
        int cnt=0;
        for(String str:words){
            int m=str.length();
            int flag=0; 
            if(n>=m){
                for(int i=0,j=0;i<m;i++,j++){
                    if(str.charAt(i)!=s.charAt(j)){
                        flag=1;
                        break;
                    }
                }
                if(flag==0)
                cnt++;
            }
        }
        return cnt;
    }
}