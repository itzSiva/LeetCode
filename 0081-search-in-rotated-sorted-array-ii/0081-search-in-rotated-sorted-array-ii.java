class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        for(int i=;i<n;i++)
        {
            if(nums[i]==target)
            {
                return true;
            }
        }
        return false;
        
    }
}