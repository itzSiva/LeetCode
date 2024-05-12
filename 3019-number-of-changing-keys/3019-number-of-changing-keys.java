class Solution {
    public int countKeyChanges(String s) {
        int cnt=0;
        String a=s.toLowerCase();
        int n=s.length();
        for(int i=0;i<n-1;i++){
            if(a.charAt(i)!=a.charAt(i+1))
            cnt++;
        }
        return cnt;
    }
}