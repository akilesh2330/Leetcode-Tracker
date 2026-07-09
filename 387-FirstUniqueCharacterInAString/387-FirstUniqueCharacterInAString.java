// Last updated: 7/9/2026, 3:09:56 PM
class Solution {
    public int firstUniqChar(String s) {
        int a=1;
        for(int i=0;i<s.length();i++){
            boolean flag=true;
            for(int j=0;j<s.length();j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(flag==true) return i;
        }
        return -1;
    }
}