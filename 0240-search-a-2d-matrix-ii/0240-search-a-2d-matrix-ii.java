class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0, high = 0, mid = 0;
        for (int i = 0; i < n; i++) {
            low = 0;
            high = matrix[i].length-1;

            while (low <= high) {
                mid = (low + high) / 2;
                if (matrix[i][mid] == target)
                    return true;
                else if (matrix[i][mid] < target)
                    low = mid + 1;
                else
                    high = mid - 1;

            }
        }

        return false;
    }
}