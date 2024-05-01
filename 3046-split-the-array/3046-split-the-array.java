class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int n=nums.length;int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j])
                cnt++;
                if(cnt>1)
                return false;
               
            }
            cnt=0;
        }
        return true;
    }
}