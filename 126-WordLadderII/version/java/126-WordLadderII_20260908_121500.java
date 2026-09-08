// Last updated: 9/8/2026, 12:15:00 PM
1class Solution {
2    public int maxPoints(int[][] points) {
3        int n = points.length;
4        if (n <= 2) return n;
5        int ans = 0;
6        for (int i = 0; i < n; i++) {
7            Map<String, Integer> map = new HashMap<>();
8            for (int j = i + 1; j < n; j++) {
9                int dx = points[j][0] - points[i][0];
10                int dy = points[j][1] - points[i][1];
11                if (dx == 0) {
12                    dy = 1;
13                }
14                else if (dy == 0) {
15                    dx = 1;
16                }
17                else {
18                    int g = gcd(dx, dy);
19                    dx /= g;
20                    dy /= g;
21                    if (dx < 0) {
22                        dx = -dx;
23                        dy = -dy;
24                    }
25                }
26                String slope = dx + "/" + dy;
27                map.put(slope, map.getOrDefault(slope, 0) + 1);
28                ans = Math.max(ans, map.get(slope) + 1);
29            }
30        }
31        return ans;
32    }
33    int gcd(int a, int b) {
34        a = Math.abs(a);
35        b = Math.abs(b);
36        while (b != 0) {
37            int temp = a % b;
38            a = b;
39            b = temp;
40        }
41        return a;
42    }
43}