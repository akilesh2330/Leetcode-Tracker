// Last updated: 7/9/2026, 3:12:45 PM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rev=0, org=x;
        while(x!=0){
            rev=rev*10+x%10;
            x/=10;
        }
        return org==rev?true:false;
    }
}