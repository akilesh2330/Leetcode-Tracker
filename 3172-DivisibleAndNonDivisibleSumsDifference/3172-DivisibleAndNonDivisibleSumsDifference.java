// Last updated: 7/9/2026, 3:08:01 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        int A=0;
        int H=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                H+=i;
            }else{
                A+=i;
            }
        }
        return A-H;
        
    }
}