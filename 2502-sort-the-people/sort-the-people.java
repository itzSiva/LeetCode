class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=names.length;
        String ans[]=new String[n];
        int k=0;
        for(int i=0;i<n;i++){
            map.put(heights[i],i);
        }
        Arrays.sort(heights);
        for(int i=n-1;i>=0;i--){
            ans[k++]=names[map.get(heights[i])];
        }
        return ans;
    }
}