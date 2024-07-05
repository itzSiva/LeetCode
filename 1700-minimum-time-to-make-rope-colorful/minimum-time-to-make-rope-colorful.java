class Solution {
    public int minCost(String colors, int[] neededTime) {
        int sum=0;
        int n=colors.length();
        char arr[]=colors.toCharArray();
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                if(neededTime[i]<neededTime[i+1]){
                    sum+=neededTime[i];
                    arr[i]=arr[i+1];
                    neededTime[i]=neededTime[i+1];
                    
                }
                else{
                    sum+=neededTime[i+1];
                    arr[i+1]=arr[i];
                    neededTime[i+1]=neededTime[i];
                 
                }
            }
        }
        return sum;
    }
}