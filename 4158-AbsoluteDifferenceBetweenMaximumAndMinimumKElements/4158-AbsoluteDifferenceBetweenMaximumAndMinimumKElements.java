// Last updated: 7/9/2026, 3:07:46 PM
class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int a=0;
        int b=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            a+=nums[i];
            b+=nums[n-1-i];
        }
        if(b>a){
            return b-a;
        }else{
            return a-b;
        }
    }
}