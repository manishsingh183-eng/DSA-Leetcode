// class Solution {
//     public int threeSumClosest(int[] nums, int target) {
//         int close=nums[0]+nums[1]+nums[2];
//         for(int i=0;i<nums.length-2;i++){
//             for(int j=i+1;j<nums.length-1;j++){
//                 for(int k=j+1;k<nums.length;k++){
//                     int sum= nums[i]+nums[j]+nums[k];
//                     int diff=Math.abs(sum-target);

//                     if(Math.abs(close-target)> diff){
//                     close=sum;
//                     }
//                 }
//             }
//         }

//         return close;
//     }
// }

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); 
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currSum = nums[i] + nums[left] + nums[right];

                if (Math.abs(currSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currSum;
                }

                if (currSum < target) {
                    left++;
                } else if (currSum > target) {
                    right--; 
                } else {
                    return target; 
                }
            }
        }
        return closestSum;
    }
}
