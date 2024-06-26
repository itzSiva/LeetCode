class Solution {
    public int largestCombination(int[] candidates) {
        int bin[]=new int[32];
        for(int i:candidates){
            for(int j=0;j<32;j++){
                int temp=i&(1<<j);
                if(temp!=0){
                    bin[j]+=1;
                }
            }
        }
        int max=1;
        for(int i:bin){
            if(i>max)
            max=i;
        }
        return max;
    }
}