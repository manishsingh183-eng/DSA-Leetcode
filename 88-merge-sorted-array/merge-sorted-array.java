class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] sorted = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                sorted[k] = nums1[i];
                i++;
            } else {
                sorted[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            sorted[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            sorted[k] = nums2[j];
            j++;
            k++;
        }
        for (int x = 0; x < m + n; x++) {
            nums1[x] = sorted[x];
        }
    }
}
