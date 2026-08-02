// Last updated: 8/2/2026, 8:55:42 AM
1class Solution {
2    public long maxPairStrength(int[] nums) {
3        long ans=0;
4        for(int i=0;i<nums.length;i++){
5            for(int j=i+1;j<nums.length;j++){
6                long a=gcd(nums[i],nums[j]);
7                long b=(1L*nums[i]*nums[j])/(a*a);
8                    ans=Math.max(ans,b);
9            }
10        }
11        return ans;
12    }
13    private long gcd(long c,long d){
14        while(d!=0){
15            long e=c%d;
16            c=d;
17            d=e;
18        }
19        return c;
20    }
21}