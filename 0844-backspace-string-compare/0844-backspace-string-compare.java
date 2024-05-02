class Solution {
    public boolean backspaceCompare(String s, String t) {
        int n=s.length();
        int m=t.length();
        Stack s1=new Stack<>();
        Stack s2=new Stack<>();
        for(int i=0;i<n;i++){
            if(s1.isEmpty()&& s.charAt(i)=='#')
            continue;
            else if(s.charAt(i)=='#')
            s1.pop();
            else
            s1.push(s.charAt(i));
        }
        for(int i=0;i<m;i++){
            if(s2.isEmpty()&& t.charAt(i)=='#')
            continue;
            else if(t.charAt(i)=='#')
            s2.pop();
            else
            s2.push(t.charAt(i));
        }
        String a="";
        String b="";
        while(!s1.isEmpty())
        a+=s1.pop();
        while(!s2.isEmpty())
        b+=s2.pop();
        

        return a.equals(b);
    }
}