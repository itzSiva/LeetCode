class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> hs=new HashSet<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(hs.contains(s.charAt(i)))
            return s.charAt(i);
            else
            hs.add(s.charAt(i));
        }
        return 'a';
    }
}