class Solution {
    public int numWaterBottles(int n, int e) {
        int ans=n;
        int rem=0;
        while(n>0&&n>=e){
            rem=n%e;
            n=n/e;
            ans+=n;
            n+=rem;  
        }
        return ans;
        
    }
}