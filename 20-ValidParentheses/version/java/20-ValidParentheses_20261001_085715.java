// Last updated: 10/1/2026, 8:57:15 AM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<>();
4
5        for (char c : s.toCharArray()) {
6
7            if (c == '(' || c == '{' || c == '[') {
8                stack.push(c);
9            } else {
10                if (stack.isEmpty())
11                    return false;
12
13                char x = stack.pop();
14
15                if ((c == ')' && x != '(') ||
16                    (c == '}' && x != '{') ||
17                    (c == ']' && x != '['))
18                    return false;
19            }
20        }
21
22        return stack.isEmpty();
23    }
24}