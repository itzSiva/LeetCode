class Solution {
    public String getEncryptedString(String s, int k) {
        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++){
            ans+=s.charAt((i+k)%n);
        }
        return ans;
    }
}