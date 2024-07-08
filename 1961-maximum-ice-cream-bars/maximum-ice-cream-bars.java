class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int cnt=0;
        for(int i:costs){
            coins=coins-i;
            if(coins>=0)
             cnt++;
            else
            return cnt;
        }
        return cnt;
    }
}