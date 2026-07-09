// Last updated: 7/9/2026, 3:07:32 PM
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int a=nums[nums.length/2];
        int b=0;
        for(int num:nums){
            if(num==a){
                b++;
            }
        }
        return b==1;
    }
}