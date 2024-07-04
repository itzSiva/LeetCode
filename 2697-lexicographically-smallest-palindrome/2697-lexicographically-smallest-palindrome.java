class Solution {
    public String makeSmallestPalindrome(String s) {
        int n=s.length();
        char[] arr=s.toCharArray();
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]<arr[j]){
                arr[j]=arr[i];
            }
            else{
                arr[i]=arr[j];
            }
            i++;
            j--;
        }
        String ans="";
        for(char c:arr){
            ans+=c;
        }
        return ans;
      
    }
}