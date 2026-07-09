// Last updated: 7/9/2026, 3:08:18 PM
class Solution {
    public int numberOfCuts(int n) {
        if(n==1) return 0;
        if(n%2==0) return n/2;
        else return n;
        
    }
}