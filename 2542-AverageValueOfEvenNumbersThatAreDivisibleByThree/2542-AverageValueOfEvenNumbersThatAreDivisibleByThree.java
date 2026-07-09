// Last updated: 7/9/2026, 3:08:23 PM
class Solution {
    public int averageValue(int[] nums) {
        int sum=0,count=0;
        for(int x:nums){
            if(x%2==0 && x%3==0){
                sum+=x;
                count++;
            }
        }
        return count==0?0:sum/count;

    }
}