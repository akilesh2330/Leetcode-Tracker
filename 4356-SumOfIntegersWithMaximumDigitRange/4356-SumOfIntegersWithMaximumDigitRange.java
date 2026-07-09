// Last updated: 7/9/2026, 3:07:37 PM
class Solution {
    public int maxDigitRange(int[] nums) {
        int a=0,sum=0;
        for(int n:nums) 
            a=Math.max(a,range(n));
        for(int n:nums)
            if(range(n)==a)
                sum+=n;
        return sum;
    }
    int range(int n){
        int max=0,min=9;
        while(n>0){
            int d=n%10;
            max=Math.max(max,d);
            min=Math.min(min,d);
            n/=10;
        }
        return max-min;
    }
}