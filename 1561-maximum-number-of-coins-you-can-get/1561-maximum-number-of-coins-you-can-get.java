class Solution {
    public int maxCoins(int[] piles) {
        int n=piles.length;
        int a=n/3;
        Arrays.sort(piles);
        int sum=0;
        for(int i=a;i<n;i+=2)
        sum+=piles[i];
        return sum;
    }
}