// Last updated: 7/9/2026, 3:09:46 PM
class Solution {
    public int hammingDistance(int x, int y) {
        int ham=x^y;
        return Integer.bitCount(ham);
        
    }
}