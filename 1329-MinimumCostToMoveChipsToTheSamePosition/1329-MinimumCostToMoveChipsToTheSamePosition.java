// Last updated: 7/9/2026, 3:08:59 PM
class Solution {
    public int minCostToMoveChips(int[] n) {
        int a=0;
        int b=0;
        for(int x:n){
            if(x%2==0){
                a++;
            }else{
                b++;
            }
        }
        return a<b?a:b;
    }
}