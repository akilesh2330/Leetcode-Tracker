// Last updated: 7/9/2026, 3:10:01 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0) return false;
        while(n%3==0){
            n=n/3;
        }
        if(n==1) return true;
        else return false;
        
    }
}