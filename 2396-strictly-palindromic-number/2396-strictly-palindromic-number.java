class Solution {
    public boolean isStrictlyPalindromic(int n) {
        String str=String.valueOf(n);
        for(int j=2;j<=n-2;j++){
            String ans=Integer.toString(Integer.parseInt(str,10),j);
            for(int i=0;i<ans.length();i++){
                if(ans.charAt(i)!=ans.charAt(ans.length()-i-1)){
                    return false;
                }
            }
        }
        return true;
    }
}