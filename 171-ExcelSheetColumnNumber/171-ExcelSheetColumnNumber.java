// Last updated: 7/9/2026, 3:10:49 PM
class Solution {
    public int titleToNumber(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            res=res*26+s.charAt(i)-64;
        }
        return res;
    }
}