// Last updated: 7/25/2026, 4:10:10 PM
1class Solution {
2    public String multiply(String num1, String num2) {
3
4        if (num1.equals("0") || num2.equals("0"))
5            return "0";
6
7        int m = num1.length();
8        int n = num2.length();
9
10        int[] result = new int[m + n];
11
12        for (int i = m - 1; i >= 0; i--) {
13            for (int j = n - 1; j >= 0; j--) {
14
15                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
16
17                int sum = mul + result[i + j + 1];
18
19                result[i + j + 1] = sum % 10;
20                result[i + j] += sum / 10;
21            }
22        }
23
24        StringBuilder ans = new StringBuilder();
25
26        for (int num : result) {
27            if (!(ans.length() == 0 && num == 0))
28                ans.append(num);
29        }
30
31        return ans.toString();
32    }
33}