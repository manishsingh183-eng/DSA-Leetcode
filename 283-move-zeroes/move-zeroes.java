// class Solution {
//     public void moveZeroes(int[] nums) {
//         int left = 0;

//         for (int right = 0; right < nums.length; right++) {
//             if (nums[right] != 0) {
//                 int temp = nums[left];
//                 nums[left] = nums[right];
//                 nums[right] = temp;
//                 left++; 
//             }
//         }
//     }
// }

class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;

        // Shift non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // "Insert" the non-zero at the front like in insertion sort
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        // Fill the rest with zeroes
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
}
