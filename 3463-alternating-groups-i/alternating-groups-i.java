class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int ans=0;
         int n=colors.length;
         for(int i=0;i<n;i++){
            if(i==0){
                if(colors[0]!=colors[1] && colors[0]!=colors[n-1])
                ans++;
            }
            else if(i==n-1){
                if(colors[n-1]!=colors[n-2] && colors[0]!=colors[n-1])
                ans++;
            }
            else if(colors[i]!=colors[i+1] && colors[i]!=colors[i-1])
            ans++;
         }
         return ans;
    }
}