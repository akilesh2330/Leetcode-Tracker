// Last updated: 7/19/2026, 8:35:31 AM
1class Solution {
2    public boolean canReach(int[] a, int[] b) {
3        return((a[0]+a[1])&1)==((b[0]+b[1])&1);
4    }
5}