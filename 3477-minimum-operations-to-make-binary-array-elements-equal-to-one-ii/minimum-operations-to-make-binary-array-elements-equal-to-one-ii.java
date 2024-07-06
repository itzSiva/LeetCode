class Solution {
    public int minOperations(int[] nums) {
        int flips=0;
        for(int i=0;i<nums.length;i++){
            if((flips-nums[i])%2==0)
            flips++;
        }
        return flips;
    }
}