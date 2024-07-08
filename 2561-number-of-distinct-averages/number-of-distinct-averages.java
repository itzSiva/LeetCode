class Solution {
    public int distinctAverages(int[] nums) {
         int n=nums.length;
        double[] ans=new double[n/2];
        Arrays.sort(nums);
        int i=0,j=n-1,k=0;
        while(i<j){
            ans[k++]=((nums[i]+nums[j])/(double)2);
            i++;
            j--;
        }
        HashSet<Double> hs=new HashSet<>();
        for(double a:ans){
            hs.add(a);
        }
        return hs.size();
    }
}