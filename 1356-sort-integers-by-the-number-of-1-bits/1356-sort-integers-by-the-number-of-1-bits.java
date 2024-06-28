class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] bits = new int[n];
        for (int i = 0; i < n; i++) {
            bits[i] = Integer.bitCount(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (bits[j] > bits[j + 1]) {
                    int temp = bits[j];
                    bits[j] = bits[j + 1];
                    bits[j+1] = temp;

                    int temp2 = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp2;
                }
            }
        }
        return arr;
    }
}