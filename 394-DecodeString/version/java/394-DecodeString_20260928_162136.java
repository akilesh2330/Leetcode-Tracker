// Last updated: 9/28/2026, 4:21:36 PM
1class Solution {
2    public String decodeString(String s) {
3        Stack<Integer> nums = new Stack<>();
4        Stack<String> words = new Stack<>();
5        String cur = "";
6        int num = 0;
7        for (char c : s.toCharArray()) {
8            if (Character.isDigit(c)) {
9                num = num * 10 + (c - '0');
10            }
11            else if (c == '[') {
12                nums.push(num);
13                words.push(cur);
14                num = 0;
15                cur = "";
16            }
17            else if (c == ']') {
18                int times = nums.pop();
19                String prev = words.pop();
20                String temp = "";
21                for (int i = 0; i < times; i++)
22                    temp += cur;
23                cur = prev + temp;
24            }
25            else {
26                cur += c;
27            }
28        }
29        return cur;
30    }
31}