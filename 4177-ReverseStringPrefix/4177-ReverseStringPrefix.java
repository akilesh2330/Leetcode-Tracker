// Last updated: 7/9/2026, 3:07:43 PM
class Solution {
    public String reversePrefix(String s, int k) {
        StringBuffer sb=new StringBuffer();
        for(int i=k-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        for(int i=k;i<s.length();i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
        
    }
}