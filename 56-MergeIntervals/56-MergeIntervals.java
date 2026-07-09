// Last updated: 7/9/2026, 3:12:05 PM
class Solution {
    public int[][] merge(int[][] name){
        Arrays.sort(name,(a,b)->Integer.compare(a[0],b[0]));
        int k=0;
        for(int i=1;i<name.length;i++){
            if(name[k][1]>=name[i][0]){
                name[k][1]=Math.max(name[i][1],name[k][1]);
            }else{
                k++;
                name[k]=name[i];
            }
        }
        return Arrays.copyOfRange(name,0,k+1);
    }
}