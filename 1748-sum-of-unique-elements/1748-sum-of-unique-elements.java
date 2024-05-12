class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i))
            map.put(i,map.get(i)+1);
            else
            map.put(i,1);
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()==1)
             sum+=m.getKey();
        }
        return sum;
    }
}