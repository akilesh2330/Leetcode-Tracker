// Last updated: 8/8/2026, 4:18:58 PM
1class Solution {
2    public List<List<Integer>> getSkyline(int[][] buildings) {
3
4        List<int[]> events = new ArrayList<>();
5
6        for (int[] b : buildings) {
7            int left = b[0];
8            int right = b[1];
9            int height = b[2];
10
11            events.add(new int[]{left, -height});
12
13            events.add(new int[]{right, height});
14        }
15
16
17        Collections.sort(events, (a, b) -> {
18            if (a[0] != b[0]) {
19                return Integer.compare(a[0], b[0]);
20            }
21            return Integer.compare(a[1], b[1]);
22        });
23
24        List<List<Integer>> result = new ArrayList<>();
25
26        PriorityQueue<Integer> pq =
27            new PriorityQueue<>(Collections.reverseOrder());
28
29        pq.offer(0);
30
31        int previousHeight = 0;
32
33        for (int[] event : events) {
34
35            int x = event[0];
36            int h = event[1];
37
38            if (h < 0) {
39                pq.offer(-h);
40            } else {
41                pq.remove(h);
42            }
43
44            int currentHeight = pq.peek();
45
46            if (currentHeight != previousHeight) {
47                result.add(Arrays.asList(x, currentHeight));
48                previousHeight = currentHeight;
49            }
50        }
51
52        return result;
53    }
54}