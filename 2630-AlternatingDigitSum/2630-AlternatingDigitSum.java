// Last updated: 7/9/2026, 3:08:14 PM
class Solution {
    public int alternateDigitSum(int n) {
        String s=String.valueOf(n);
        int a=0;
        for(int i=0;i<s.length();i++){
            int b=s.charAt(i)-'0';
            if(i%2==0){
                a+=b;
            }else{
                a-=b;
            }
        }
        return a;
    }
}