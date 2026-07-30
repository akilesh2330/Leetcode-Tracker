// Last updated: 7/30/2026, 2:48:06 PM
1class Solution {
2    public int minimumPushes(String word) {        int n = word.length();
3        int pushes = 0;
4        for (int i = 0; i < n; i++) {
5            pushes += (i / 8) + 1;
6        }
7        return pushes;
8    }
9}