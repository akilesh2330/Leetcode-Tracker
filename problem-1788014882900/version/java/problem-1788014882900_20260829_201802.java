// Last updated: 8/29/2026, 8:18:02 PM
1class Solution {
2    public int minBishopMoves(int[] s, int[] t) {
3        int sr=s[0],sc=s[1];
4        int tr=t[0],tc=t[1];
5        if((sr+sc)%2!=(tr+tc)%2) return -1;
6        if(sr-sc==tr-tc||sr+sc==tr+tc) return 1;
7        return 2;
8    }
9}