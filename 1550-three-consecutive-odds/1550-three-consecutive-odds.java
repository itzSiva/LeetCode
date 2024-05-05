class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(cnt==3)
            return true;
            if(arr[i]%2==1)
             ++cnt;
             else
             cnt=0;
        }
        if(cnt==3)
        return true;
        return false;
    }
}