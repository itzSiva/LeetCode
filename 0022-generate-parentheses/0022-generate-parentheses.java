class Solution {
    public void helper(int open ,int close, List<String> ans,String s){
        if(open==0 && close==0)
            ans.add(s);
         if(open>0){
            helper(open-1,close,ans,s+"(");
        }
        if(close>open){
            helper(open,close-1,ans,s+")");
        }

    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        int open=n;
        int close=n;
        helper(open,close,ans,"");
        return ans;
    }
}