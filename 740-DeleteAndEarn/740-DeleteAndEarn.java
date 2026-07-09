// Last updated: 7/9/2026, 3:09:19 PM
class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] points = new int[10001];
        for (int num : nums) {
            points[num] += num;
        }
        int take = 0;
        int skip = 0;
        for (int i = 0; i < points.length; i++) {
            int takei = skip + points[i];
            int skipi = Math.max(skip, take);
            take = takei;
            skip = skipi;
        }
        return Math.max(take, skip);
    }
}