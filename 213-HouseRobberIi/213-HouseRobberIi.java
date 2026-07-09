// Last updated: 7/9/2026, 3:10:17 PM
class Solution {

    public int rob(int[] nums) {

        if (nums.length == 1)
            return nums[0];

        int a = helper(nums, 0, nums.length - 2);
        int b = helper(nums, 1, nums.length - 1);

        return Math.max(a, b);
    }

    int helper(int[] nums, int start, int end) {

        int prev1 = 0;
        int prev2 = 0;

        for (int i = start; i <= end; i++) {

            int curr = Math.max(prev1, prev2 + nums[i]);

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}