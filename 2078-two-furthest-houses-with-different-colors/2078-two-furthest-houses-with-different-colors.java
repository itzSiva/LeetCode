class Solution {
    public int maxDistance(int[] colors) {
        int ans=0,n=colors.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(colors[i]!=colors[j])
                ans=Math.max(ans,j-i);
            }
        }
        return ans;
    }
}