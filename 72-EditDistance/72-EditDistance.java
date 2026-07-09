// Last updated: 7/9/2026, 3:11:44 PM
class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length(),m=word2.length();
        int [][] arr=new int[n+1][m+1];
        for(int i=0;i<m+1;i++) arr[0][i]=i;
        for(int i=0;i<n+1;i++) arr[i][0]=i;

        for(int i=1;i<n+1;i++) {
            for(int j=1;j<m+1;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)) arr[i][j]=arr[i-1][j-1];
                else arr[i][j] = 1 + Math.min(Math.min(arr[i-1][j], arr[i][j-1]),arr[i-1][j-1]);
            }
        } 
        return arr[n][m];   
    }
}