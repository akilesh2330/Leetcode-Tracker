// Last updated: 7/9/2026, 3:07:31 PM
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int a=nums[0];
        int b=0;
        for(int i=k;i<nums.length;i++){
            a=Math.max(a,nums[i-k]);
            b=Math.max(b,a+nums[i]);
        }
        return b;
    }
}