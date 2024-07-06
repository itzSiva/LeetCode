class Solution {
    public int minOperations(int[] nums) {
        int flips=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if((i==n-2 && nums[i]==0) || i==n-1 && nums[i]==0)
             return -1;
            if(nums[i]==0){
                nums[i]=nums[i]^1;
                nums[i+1]=nums[i+1]^1;
                nums[i+2]=nums[i+2]^1;
                  flips++;
            }
        }
        return flips;
    }
}