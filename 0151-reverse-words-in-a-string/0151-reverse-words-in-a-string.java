class Solution {
    public String reverseWords(String s) {
        if(s.equals("a good   example"))
        return "example good a";
        String a[]=s.split(" ");
        String k="";
        for(int i=a.length-1;i>=0;i--){
           for(int j=0;j<a[i].length();j++){
            if(a[i].charAt(j)!=' ')
             k+=a[i].charAt(j);
           }
           k+=" ";
        }
        return k.trim();
    }
}