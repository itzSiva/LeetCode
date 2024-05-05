class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==original){
            original*=2;
            i=-1;
            }
        }
        return original;
    }
}