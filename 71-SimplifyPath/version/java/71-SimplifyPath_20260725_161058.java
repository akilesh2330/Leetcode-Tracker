// Last updated: 7/25/2026, 4:10:58 PM
1class Solution {
2    public String simplifyPath(String path) {
3
4        Stack<String> stack = new Stack<>();
5
6        String[] parts = path.split("/");
7
8        for (String part : parts) {
9
10            if (part.equals("") || part.equals(".")) {
11                continue;
12            } 
13            else if (part.equals("..")) {
14                if (!stack.isEmpty())
15                    stack.pop();
16            } 
17            else {
18                stack.push(part);
19            }
20        }
21
22        StringBuilder ans = new StringBuilder();
23
24        for (String dir : stack) {
25            ans.append("/").append(dir);
26        }
27
28        return ans.length() == 0 ? "/" : ans.toString();
29    }
30}