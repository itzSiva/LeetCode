class Solution {
    public int countTriples(int n) {
        int cnt=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=(i+1)*(i+1);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(a[i]+a[j]==a[k])
                    cnt++;
                }
            }
        }
        return cnt*2;
    }
}