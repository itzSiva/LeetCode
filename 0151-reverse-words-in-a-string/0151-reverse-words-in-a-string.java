class Solution {
    public String reverseWords(String s) {
       
        String a[]=s.split(" ");
        String k="";int flag=0;
        for(int i=a.length-1;i>=0;i--){
            flag=0;
           for(int j=0;j<a[i].length();j++){
            if(a[i].charAt(j)!=' '){
             k+=a[i].charAt(j);
             flag=1;
            }
           }
           if(flag==1)
           k+=" ";
        }
        return k.trim();
    }
}