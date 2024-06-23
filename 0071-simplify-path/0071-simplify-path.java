class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
         Stack<String> st2 = new Stack<>();
        String arr[]=path.split("/");
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i].equals("") || arr[i].equals("."))
            continue;
            else if((!st.isEmpty()) && arr[i].equals(".."))
            st.pop();
            else if(!arr[i].equals(".."))
            st.push(arr[i]);
        }
       while(!st.isEmpty()){
        st2.push(st.pop());
       }
       String ans="";
        while(!st2.isEmpty()){
        ans+="/"+st2.pop();
       }
       if(ans.length()==0)
        return "/";
       return ans;
    }
}