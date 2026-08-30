// Last updated: 8/30/2026, 9:13:09 AM
1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3        HashSet<Integer>set=new HashSet<>();
4        HashSet<Integer>bad=new HashSet<>();
5        int a=-1;
6        for(int x:nums){
7            if(set.contains(x)&&x!=a)
8                bad.add(x);
9            set.add(x);
10            a=x;
11        }
12        return set.size()-bad.size();
13
14    }
15}