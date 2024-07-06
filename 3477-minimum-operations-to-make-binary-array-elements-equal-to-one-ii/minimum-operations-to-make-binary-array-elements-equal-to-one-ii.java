class Solution {
    public int minOperations(int[] nums) {
        int flips=0;int n=nums.length;
        for(int i=0;i<n;i++){
            if((flips-nums[i])%2==0)
            flips++;
        }
        return flips;
    }
}