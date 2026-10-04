// Last updated: 10/4/2026, 9:18:20 AM
1class Solution {
2    public int minRotations(String s) {
3        int a=0;
4        int b=0;
5        for(char c:s.toCharArray()){
6            int m=c-'0';
7            int cl=(m-a+10)%10;
8            int ac=(a-m+10)%10;
9            b+=Math.min(cl,ac);
10            a=m;
11        }
12        return b;
13    }
14}