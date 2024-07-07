import java.util.Arrays;

class Solution {
    public int countDays(int days, int[][] meetings) {
        // Sort the meetings by start day
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        
        int freeDays = days;
        int currentEnd = 0;
        
        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];
            
            // If the current meeting starts after the current end, it means there are free days in between
            if (start > currentEnd) {
                freeDays -= (end - start + 1);
                currentEnd = end;
            } else if (end > currentEnd) {
                freeDays -= (end - currentEnd);
                currentEnd = end;
            }
        }

        return freeDays;
    }
}
