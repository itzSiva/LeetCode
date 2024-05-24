class Solution {
    public int mostWordsFound(String[] s) {
        int max=0;
        for(int i=0;i<s.length;i++){
            String a[]=s[i].split(" ");
            int n=a.length;
            if(n>max)
            max=n;
        }
        return max;
    }
}