class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        Stack<Character> s1=new Stack<>();
        String a="";
        for(int i=n-1;i>=0;i--){
            if((!s1.isEmpty())&&s1.peek()==s.charAt(i))
            s1.pop();
            else
            s1.push(s.charAt(i));
        }
        while(!s1.isEmpty())
        a+=s1.pop();
        return a;
    }
}