// Last updated: 8/8/2026, 4:20:38 PM
1class Solution {
2    public int calculate(String s) {
3
4        Stack<Integer> stack = new Stack<>();
5
6        int result = 0;
7        int number = 0;
8        int sign = 1;
9
10        for (int i = 0; i < s.length(); i++) {
11
12            char c = s.charAt(i);
13
14            if (Character.isDigit(c)) {
15                number = number * 10 + (c - '0');
16            }
17
18            else if (c == '+') {
19                result += sign * number;
20                number = 0;
21                sign = 1;
22            }
23
24            else if (c == '-') {
25                result += sign * number;
26                number = 0;
27                sign = -1;
28            }
29
30            else if (c == '(') {
31                stack.push(result);
32                stack.push(sign);
33
34                result = 0;
35                sign = 1;
36            }
37
38            else if (c == ')') {
39                result += sign * number;
40                number = 0;
41
42                result *= stack.pop();
43                result += stack.pop();
44            }
45        }
46
47        result += sign * number;
48
49        return result;
50    }
51}