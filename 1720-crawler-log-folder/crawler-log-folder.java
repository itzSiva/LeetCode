class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st=new Stack<>();
        int n=logs.length;
        for(int i=0;i<n;i++){
            
            if((!st.isEmpty()) && logs[i].equals("../"))
            st.pop();
            else if(logs[i].equals("./"))
            continue;
            else if(!logs[i].equals("./") && ! logs[i].equals("../"))
            st.push(" ");
        }
        return st.size();
    }
}