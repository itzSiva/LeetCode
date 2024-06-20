class Solution {
    public int prefixCount(String[] words, String pref) {
        int m=pref.length();
        int cnt=0;
        for(String str:words){
            int n=str.length();
            int flag=0;
            if(n>=m){
                for(int i=0,j=0;j<m;i++,j++){
                    if(str.charAt(i)!=pref.charAt(j)){
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