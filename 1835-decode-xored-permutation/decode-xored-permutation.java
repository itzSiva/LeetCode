class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length + 1;
        int[] perm = new int[n];
        int totalXOR = 0;
        for (int i = 1; i <= n; i++) {
            totalXOR ^= i;
        }
        int oddXOR = 0;
        for (int i = 1; i < encoded.length; i += 2) {
            oddXOR ^= encoded[i];
        }
        perm[0] = totalXOR ^ oddXOR;
        for (int i = 1; i < n; i++) {
            perm[i] = perm[i - 1] ^ encoded[i - 1];
        }
        return perm;
    }
}