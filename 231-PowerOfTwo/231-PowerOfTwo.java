// Last updated: 7/9/2026, 3:10:15 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        while(n%2==0){
            n=n/2;
        }
        if(n==1) return true;
        else return false;
        
    }
}