class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        int start = 0, end = n - 1, mid;

        while (start < end) {
            mid = start + (end - start) / 2;

            if (matrix[mid][m - 1] < target) {
                start = mid + 1;
            } else if (matrix[mid][m - 1] > target) {
                end = mid;
            } else {
                return true;
            }
        }

        int colIndex = binarySearch(matrix[start], target);
        return colIndex != -1;
    }

    public static int binarySearch(int[] row, int target) {
        int start = 0, end = row.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (row[mid] == target) return mid;
            else if (row[mid] < target) start = mid + 1;
            else end = mid - 1;
        }

        return -1;
    }
}
