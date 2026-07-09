// Last updated: 7/9/2026, 3:07:35 PM
class Solution {
    public boolean checkGoodInteger(int n) {
        int a=0;
        int b=0;
        while(n>0){
            int c=n%10;
            a+=c;
            b+=c*c;
            n=n/10;
        }
        return(b-a)>=50;
    }
}