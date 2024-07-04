class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(st.size()>=1 &&s.charAt(i)==st.peek())
            {
                st.push(s.charAt(i));
                continue;
            }
            if(st.size()>=1 && (Character.toUpperCase(st.peek())==s.charAt(i) ||st.peek()==Character.toUpperCase(s.charAt(i)) ))
            st.pop();
            else
            st.push(s.charAt(i));
        }
        String str="";
        while(!st.isEmpty()){
            str+=st.pop();
        }
    System.out.println(str);
    String ans="";
     for(int i=str.length()-1;i>=0;i--){
        ans+=str.charAt(i);
     }
     return ans;
        
    }
}