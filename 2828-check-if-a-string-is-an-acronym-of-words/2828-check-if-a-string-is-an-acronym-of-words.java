class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int n=words.size();
        int k=0;
        if(n!=s.length())
        return false;
        for(int i=0;i<n;i++,k++){
            if(words.get(i).charAt(0)!=s.charAt(k))
            return false;
        }
        return true;
    }
}