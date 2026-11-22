class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }
        Arrays.sort(nums);
        int count = 0;
        int left = 0;
        int right = 1;
        while (right < nums.length) {
            if (left == right || nums[right] - nums[left] < k) {
                right++;
            } 
            else if (nums[right] - nums[left] > k) {
                left++;
            } 
            else {
                count++;
                int leftValue = nums[left];
                int rightValue = nums[right];
                while (left < nums.length && nums[left] == leftValue) {
                    left++;
                }
                while (right < nums.length && nums[right] == rightValue) {
                    right++;
                }
            }
        }
        return count;
    }
}