class Solution {
    public int maximumDifference(int[] nums) {
        int diff=-1;
        for(int i=nums.length-1;i>0;i--){
            for(int j=i-1;j>=0;j--){
                if(nums[i]!=nums[j])
            diff=Math.max(diff,nums[i]-nums[j]);
            }
        }
       
        return diff;
    }
}