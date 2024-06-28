class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (Integer.bitCount(arr[j]) > Integer.bitCount(arr[j+1])) {
                   

                    int temp2 = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp2;
                }
            }
        }
        return arr;
    }
}