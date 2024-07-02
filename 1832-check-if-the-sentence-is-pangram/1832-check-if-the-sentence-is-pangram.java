class Solution {
    public boolean checkIfPangram(String s) {
        
        
        for (char c = 'a'; c <= 'z'; c++) {
            if(!s.contains(s.valueOf(c)))
            return false;
        }

        return true;

    }
}