// Last updated: 8/1/2026, 8:58:04 PM
1class Solution {
2    public int countValidPrefixes(String s) {
3        int a=0,b=0;
4        int c=0;
5        for(int i=0;i<s.length();i++){
6            if(s.charAt(i)=='0'){
7                a++;
8            }else{
9                b++;
10            }
11            if(Math.abs(a-b)<=1){
12                c++;
13            }
14        }
15        return c;
16    }
17}