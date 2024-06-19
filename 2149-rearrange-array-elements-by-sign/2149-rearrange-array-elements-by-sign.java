class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int a[]= new int[n];
        for(int i=0,j=0;i<n;j++){
            if(nums[j]>0){
                a[i]=nums[j];
                 i+=2;
            }
        }
        for(int i=1, j=0;i<n;j++){
            if(nums[j]<0){
                a[i]=nums[j];
                i+=2;
            }
        }
        return a;
    }
}