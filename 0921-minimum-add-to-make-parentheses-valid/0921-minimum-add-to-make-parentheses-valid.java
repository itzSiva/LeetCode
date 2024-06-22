class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(')
                st.push('(');
            else if((!st.isEmpty()) &&s.charAt(i)==')' && st.peek()=='(')
                st.pop();
            else
                st.push(')');
        }
        return  st.size();
    }
}