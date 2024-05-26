class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
       int n=purchaseAmount % 10;
        if( n<5)
        return 100-(purchaseAmount-n);
        else
        return 100-(purchaseAmount-n+10);
    }
}