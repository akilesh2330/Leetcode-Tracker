// Last updated: 7/9/2026, 3:09:50 PM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int a=0;
        int b=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(b>intervals[i][0]){
                a++;
            }else{
                b=intervals[i][1];
            }
        }
        return a;
    }
}