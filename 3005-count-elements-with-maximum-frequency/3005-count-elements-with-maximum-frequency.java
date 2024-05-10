class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        int max = 0;
        int ans = 0;
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            int var = m.getValue();
            if (var > max) {
                max = var;
                ans = max;
            }
           else if (var == max) {
                ans += var;
            }
        }
        return ans;
    }
}