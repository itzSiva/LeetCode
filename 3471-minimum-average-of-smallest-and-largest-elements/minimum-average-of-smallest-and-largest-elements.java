class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        double[] ans=new double[n/2];
        Arrays.sort(nums);
        int i=0,j=n-1,k=0;
        while(i<j){
            ans[k++]=((nums[i]+nums[j])/(double)2);
            i++;
            j--;
        }
        double min=Double.MAX_VALUE;
        for(double a:ans){
            if(a<min)
            min=a;
        }
        return min;
    }
}