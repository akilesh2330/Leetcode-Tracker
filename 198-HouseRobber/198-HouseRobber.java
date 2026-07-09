// Last updated: 7/9/2026, 3:10:23 PM
class Solution {
    public int rob(int[] nums) {
        int a=0;
        int b=0;
        int m=0;
        for(int i:nums){
            m=Math.max(a,b+i);
            b=a;
            a=m;
        }return m;        
    }
}