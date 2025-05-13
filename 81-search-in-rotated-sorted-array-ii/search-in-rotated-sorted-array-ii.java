class Solution {
    public boolean search(int[] nums, int target) {
        int pivot = pivot(nums);

        if (pivot == -1) {
            return bsearch(nums, target, 0, nums.length - 1) != -1;
        }

        if (nums[pivot] == target) {
            return true;
        }

        if (target >= nums[0]) {
            return bsearch(nums, target, 0, pivot - 1) != -1;
        } else {
            return bsearch(nums, target, pivot + 1, nums.length - 1) != -1;
        }
    }

    private int pivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                if (start < end && nums[start] > nums[start + 1]) return start;
                start++;

                if (end > start && nums[end] < nums[end - 1]) return end - 1;
                end--;
            }
            else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    private int bsearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
