class Solution {
    public String sortVowels(String s) {
        int n=s.length();
        List <Character> li=new ArrayList<>();
        String ans="";
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='o'||c=='u'||c=='i'){
                li.add(s.charAt(i));
            }
        }int k=0;
        Collections.sort(li);
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='o'||c=='u'||c=='i'){
                ans+=li.get(k++);
            }
        else{
            ans+=s.charAt(i);
        }
        }return ans;
    }
}
    