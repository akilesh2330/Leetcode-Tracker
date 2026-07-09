// Last updated: 7/9/2026, 3:09:15 PM
class Solution {
    public int search(int[] a, int b) {
        int c=0;
        int d=a.length-1;
        while(c<=d){
            int e=c+(d-c)/2;

            if(a[e]==b){
                return e;
            }else if(a[e]<b){
                c=e+1;
            }else{
                d=e-1;
            }
        }
        return -1;

    }
}