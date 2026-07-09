// Last updated: 7/9/2026, 3:07:41 PM
class Solution {
    public String largestEven(String s) {
        int n=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='2'){
                n=i;
            }
        }
        if(n==-1){
            return "";
        }
        return s.substring(0,n+1);
            
        
    }
}