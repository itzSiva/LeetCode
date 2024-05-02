class Solution {
    public boolean detectCapitalUse(String word) {
        int n=word.length();
        char ch=word.charAt(n-1);int elem=0;
        if(ch>='A'&&ch<='Z')
            elem=1;
        else
            elem=2;
        switch(elem){
            case 1:
             for(int i=0;i<n;i++){
                if(word.charAt(i)<'A' || word.charAt(i)>'Z')
                return false;
             }
             break;
             case 2:
             for(int i=1;i<n;i++){
                if(word.charAt(i)<'a' || word.charAt(i)>'z')
                return false;
             }
             break;
        }
        return true;
    }
}