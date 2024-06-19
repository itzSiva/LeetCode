class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n=nums.length;
        int arr[]=new int[2*n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            int sum=0;
            while(nums[i]!=0)
            {
                int rem=nums[i]%10;
                sum=(sum*10)+rem;
                nums[i]=nums[i]/10;
            }
            arr[n+i]=sum;
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else
            {
                hm.put(arr[i],1);
            }
        } 
        int ans=0;
        for(Map.Entry<Integer,Integer> m:hm.entrySet())
        {
           ans++;
        }
        return ans;
    }
}