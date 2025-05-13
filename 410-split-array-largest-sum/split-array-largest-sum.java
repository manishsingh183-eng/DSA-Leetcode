class Solution {
    public int splitArray(int[] nums, int m) {
        int low = 0;
        int high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            int currentSum = 0;
            int subarrays = 1;

            for (int n : nums) {
                if (currentSum + n > mid) {
                    currentSum = n;
                    subarrays++;
                } else {
                    currentSum += n;
                }
            }

            if (subarrays > m) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return high;
    }
}

