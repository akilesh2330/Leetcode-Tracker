// Last updated: 10/5/2026, 11:06:55 AM
1class Solution {
2    public int scoreOfParentheses(String s) {
3
4        Stack<Integer> stack = new Stack<>();
5        stack.push(0);
6
7        for (char c : s.toCharArray()) {
8
9            if (c == '(') {
10                stack.push(0);
11            } else {
12                int x = stack.pop();
13
14                if (x == 0)
15                    x = 1;
16                else
17                    x = 2 * x;
18
19                stack.push(stack.pop() + x);
20            }
21        }
22
23        return stack.pop();
24    }
25}