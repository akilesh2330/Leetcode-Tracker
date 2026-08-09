// Last updated: 8/9/2026, 8:55:56 AM
1class Solution {
2    public double minPrice(int[] p, int[] d) {
3        Arrays.sort(p);
4        Arrays.sort(d);
5        double a=0;
6        int i=p.length-1;
7        int j=d.length-1;
8        while(j>=0&&i>=0){
9            a+=(p[i]*(100-d[j]))/100.0;
10            j--;
11            i--;
12        }
13        if(i>j){
14            for(int k=0;k<=i;k++) a+=p[k];
15        }
16        return a;
17        
18    }
19}