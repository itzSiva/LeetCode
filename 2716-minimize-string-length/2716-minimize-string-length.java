class Solution {
    public int minimizedStringLength(String s) {
        int n=s.length();
        int m=n;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(s.charAt(i)==s.charAt(j)){
                    m--;
                    break;
                }
            }
        }
            return m;
    }
}