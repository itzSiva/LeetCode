class Solution {
    public boolean isFascinating(int n) {
        int n1 = n * 2;
        int n2 = n * 3;
        String s = String.valueOf(n) + String.valueOf(n1) + String.valueOf(n2);
        String k = "123456789";
        int m = s.length();
        if (m != 9)
            return false;
        for (int i = 0; i < 9; i++) {
            int flag = 0;
            for (int j = 0; j < 9; j++) {
                if (s.charAt(i) == k.charAt(j)) {
                    flag = 1;
                    break;
                }

            }
            if (flag == 0)
                return false;
        }
        return true;

    }
}