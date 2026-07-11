// Last updated: 7/11/2026, 10:03:19 AM
1class Solution {
2    public int countCompleteComponents(int n, int[][] edges) {
3        List<Integer>[] graph = new ArrayList[n];
4        for (int i = 0; i < n; i++)
5            graph[i] = new ArrayList<>();
6        for (int[] edge : edges) {
7            graph[edge[0]].add(edge[1]);
8            graph[edge[1]].add(edge[0]);
9        }
10        boolean[] visited = new boolean[n];
11        int answer = 0;
12        for (int i = 0; i < n; i++) {
13            if (!visited[i]) {
14                int[] count = new int[2];
15                dfs(i, graph, visited, count);
16                int nodes = count[0];
17                int degree = count[1];
18                if (degree == nodes * (nodes - 1))
19                    answer++;
20            }
21        }
22        return answer;
23    }
24    private void dfs(
25        int node,
26        List<Integer>[] graph,
27        boolean[] visited,
28        int[] count
29    ) {
30        visited[node] = true;
31        count[0]++;                    
32        count[1] += graph[node].size(); 
33        for (int next : graph[node]) {
34            if (!visited[next])
35                dfs(next, graph, visited, count);
36        }
37    }
38}