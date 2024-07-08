class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int n=nums.length;int xor=0;
        for(int i:nums){
            if(hs.contains(i))
             xor^=i;
            else
            hs.add(i);
        }
        return xor;
    }
}