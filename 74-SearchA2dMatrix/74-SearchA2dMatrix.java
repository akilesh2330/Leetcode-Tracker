// Last updated: 7/9/2026, 3:11:43 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int a=0;
        int b=matrix[0].length-1;
        while(a<matrix.length&&b>=0){
            if(matrix[a][b]==target){
                return true;
            }else if(matrix[a][b]<target){
                a++;
            }else{
            b--;
            }
        }
        return false;
    }
}