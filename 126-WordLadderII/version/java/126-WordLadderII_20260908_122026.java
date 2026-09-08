// Last updated: 9/8/2026, 12:20:26 PM
1class Solution {
2
3    String[] ones = {
4        "", "One", "Two", "Three", "Four", "Five",
5        "Six", "Seven", "Eight", "Nine", "Ten",
6        "Eleven", "Twelve", "Thirteen", "Fourteen",
7        "Fifteen", "Sixteen", "Seventeen", "Eighteen",
8        "Nineteen"
9    };
10
11    String[] tens = {
12        "", "", "Twenty", "Thirty", "Forty",
13        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
14    };
15
16    public String numberToWords(int num) {
17        if (num == 0)
18            return "Zero";
19
20        return solve(num).trim().replaceAll(" +", " ");
21    }
22
23    String solve(int n) {
24
25        if (n == 0)
26            return "";
27
28        if (n < 20)
29            return ones[n];
30
31        if (n < 100)
32            return tens[n / 10] + " " + solve(n % 10);
33
34        if (n < 1000)
35            return solve(n / 100) + " Hundred " + solve(n % 100);
36
37        if (n < 1000000)
38            return solve(n / 1000) + " Thousand " + solve(n % 1000);
39
40        if (n < 1000000000)
41            return solve(n / 1000000) + " Million " + solve(n % 1000000);
42
43        return solve(n / 1000000000) + " Billion " + solve(n % 1000000000);
44    }
45}