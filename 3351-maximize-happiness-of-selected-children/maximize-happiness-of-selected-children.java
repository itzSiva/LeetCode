class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n=happiness.length;
        long ans=0;
        Arrays.sort(happiness);
        int j=0;
        for(int i=n-1;i>=n-k;i--){
            ans+=Math.max(0,happiness[i]-j);
            j++;
        }
        return ans;
    }
}