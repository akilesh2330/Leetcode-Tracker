// Last updated: 7/9/2026, 3:07:59 PM
import java.util.*;
class Solution {
    TreeMap<Integer, Integer> left = new TreeMap<>();
    TreeMap<Integer, Integer> right = new TreeMap<>();
    long leftSum = 0;
    int leftSize = 0;
    void add(TreeMap<Integer, Integer> map, int x) {
        map.put(x, map.getOrDefault(x, 0) + 1);
    }
    void remove(TreeMap<Integer, Integer> map, int x) {
        if (map.get(x) == 1)
            map.remove(x);
        else
            map.put(x, map.get(x) - 1);
    }
    void addNum(int x, int k) {
        if (leftSize < k) {
            add(left, x);
            leftSum += x;
            leftSize++;
        } else {
            int maxLeft = left.lastKey();
            if (x < maxLeft) {
                remove(left, maxLeft);
                add(right, maxLeft);
                leftSum -= maxLeft;
                add(left, x);
                leftSum += x;
            } else {
                add(right, x);
            }
        }
    }
    void removeNum(int x, int k) {
        if (left.containsKey(x)) {
            remove(left, x);
            leftSum -= x;
            leftSize--;
            if (!right.isEmpty()) {
                int minRight = right.firstKey();
                remove(right, minRight);
                add(left, minRight);
                leftSum += minRight;
                leftSize++;
            }
        } else {
            remove(right, x);
        }
    }
    public long minimumCost(int[] nums, int k, int dist) {
        left.clear();
        right.clear();
        leftSum = 0;
        leftSize = 0;
        for (int i = 1; i <= dist + 1; i++)
            addNum(nums[i], k - 1);
        long ans = nums[0] + leftSum;
        for (int i = dist + 2; i < nums.length; i++) {
            addNum(nums[i], k - 1);
            removeNum(nums[i - dist - 1], k - 1);
            ans = Math.min(ans, nums[0] + leftSum);
        }
    return ans;
    }
}