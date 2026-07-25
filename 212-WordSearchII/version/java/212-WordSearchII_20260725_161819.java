// Last updated: 7/25/2026, 4:18:19 PM
1class Solution {
2
3    class TrieNode {
4        TrieNode[] child = new TrieNode[26];
5        String word;
6    }
7
8    TrieNode root = new TrieNode();
9    List<String> ans = new ArrayList<>();
10
11    public List<String> findWords(char[][] board, String[] words) {
12
13        for (String word : words) {
14            TrieNode node = root;
15            for (char c : word.toCharArray()) {
16                int i = c - 'a';
17                if (node.child[i] == null)
18                    node.child[i] = new TrieNode();
19                node = node.child[i];
20            }
21            node.word = word;
22        }
23
24        int m = board.length;
25        int n = board[0].length;
26
27        for (int i = 0; i < m; i++) {
28            for (int j = 0; j < n; j++) {
29                dfs(board, i, j, root);
30            }
31        }
32
33        return ans;
34    }
35
36    private void dfs(char[][] board, int i, int j, TrieNode node) {
37
38        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length)
39            return;
40
41        char c = board[i][j];
42
43        if (c == '#')
44            return;
45
46        node = node.child[c - 'a'];
47
48        if (node == null)
49            return;
50
51        if (node.word != null) {
52            ans.add(node.word);
53            node.word = null;
54        }
55
56        board[i][j] = '#';
57
58        dfs(board, i + 1, j, node);
59        dfs(board, i - 1, j, node);
60        dfs(board, i, j + 1, node);
61        dfs(board, i, j - 1, node);
62
63        board[i][j] = c;
64    }
65}