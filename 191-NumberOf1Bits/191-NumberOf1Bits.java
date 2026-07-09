// Last updated: 7/9/2026, 3:10:27 PM
class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            if((n&1)==1){
                count++;
            }
            n>>=1;
        }
        return count;
        
    }
}