// Last updated: 7/9/2026, 3:10:05 PM
class Solution {
    public int missingNumber(int[] nums) {
        int result=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                result=i;
                break;
            }
            
        }
        return result; 
    }
}
