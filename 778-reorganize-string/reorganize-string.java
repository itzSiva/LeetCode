class Solution {
    public String reorganizeString(String s) {
        int[][] m=new int[26][2];
        for(int i=0;i<26;++i) m[i][0]=i;
        char[] ch=s.toCharArray();
        for(char c: ch) m[c-'a'][1]++;
        Arrays.sort(m, (a,b)->b[1]-a[1]);
        int ind=0, n=s.length(), mod=(n%2)==0? n-1: n;
        if(m[0][1]>Math.ceil(n/2.0)) return "";
        for(int i=0;i<26;++i) {
            while(m[i][1]-->0) {
                int pos = ind==mod? mod: (ind*2)%mod;
                ch[pos]=(char)(m[i][0]+'a');
                ind++;
            }
        }
        return new String(ch);
    }
}