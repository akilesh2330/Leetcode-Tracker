// Last updated: 7/9/2026, 3:09:18 PM
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=1;i<matrix.length;i++)
            for(int j=1;j<matrix[i].length;j++)
                if(matrix[i][j]!=matrix[i-1][j-1]) return false;
        return true;
            }
        
    
}