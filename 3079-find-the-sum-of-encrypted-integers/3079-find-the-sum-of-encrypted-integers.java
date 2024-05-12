class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;int rem=0;
        for(int i=0;i<nums.length;i++){
        String s=String.valueOf(nums[i]);
        int max=0;int n=s.length();
        for(int j=0;j<n;j++){
            char c=s.charAt(j);
            if(c-'0'>max)
            max=Character.getNumericValue(c);
        }
        String add="";
        while(n>0){
            add+='1';
            n--;
        }
        sum+=max*Integer.valueOf(add);
        
        } 
        return sum;
    }
}