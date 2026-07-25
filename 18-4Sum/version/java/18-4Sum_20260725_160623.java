// Last updated: 7/25/2026, 4:06:23 PM
1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3
4        List<List<Integer>> ans = new ArrayList<>();
5        Arrays.sort(nums);
6        int n = nums.length;
7
8        for (int i = 0; i < n - 3; i++) {
9
10            if (i > 0 && nums[i] == nums[i - 1])
11                continue;
12
13            for (int j = i + 1; j < n - 2; j++) {
14
15                if (j > i + 1 && nums[j] == nums[j - 1])
16                    continue;
17
18                int left = j + 1;
19                int right = n - 1;
20
21                while (left < right) {
22
23                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
24
25                    if (sum == target) {
26                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
27
28                        left++;
29                        right--;
30
31                        while (left < right && nums[left] == nums[left - 1])
32                            left++;
33
34                        while (left < right && nums[right] == nums[right + 1])
35                            right--;
36
37                    } else if (sum < target) {
38                        left++;
39                    } else {
40                        right--;
41                    }
42                }
43            }
44        }
45
46        return ans;
47    }
48}