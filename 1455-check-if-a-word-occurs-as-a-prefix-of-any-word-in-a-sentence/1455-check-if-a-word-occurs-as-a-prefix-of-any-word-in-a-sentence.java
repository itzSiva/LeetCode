class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");
        int n = arr.length;
        int m = searchWord.length();
        int position = 1;
        for (String str : arr) {
            int flag = 0;
            if (str.length() >= m) {
                for (int i = 0, j = 0; j < m; i++, j++) {
                    if (str.charAt(i) != searchWord.charAt(j)) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)
                    return position;
            }
            position++;
        }
        return -1;
    }
}