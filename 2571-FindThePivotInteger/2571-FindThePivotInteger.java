// Last updated: 7/9/2026, 3:08:20 PM
class Solution {
    public int pivotInteger(int n){
        int total=(n*(n+1))/2;
        int s=(int)Math.sqrt(total);
        if((s*s)==total) return s;
        else return -1;            
    }
}