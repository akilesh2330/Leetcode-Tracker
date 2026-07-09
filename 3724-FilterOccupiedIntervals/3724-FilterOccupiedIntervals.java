// Last updated: 7/9/2026, 3:07:52 PM
class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] a, int freeStart, int freeEnd) {
        Arrays.sort(a,(x,y)->x[0]-y[0]);
        List<int[]>m=new ArrayList<>();
        for(int[]i:a){
            if(m.isEmpty()||i[0]>m.get(m.size()-1)[1]+1){
                m.add(i);
            }else{
                m.get(m.size()-1)[1]=Math.max(m.get(m.size()-1)[1],i[1]);
            }
        }
        List<List<Integer>>ans=new ArrayList<>();
        for(int[]i:m){
            if(i[1]<freeStart||i[0]>freeEnd){
                ans.add(Arrays.asList(i[0],i[1]));
            }else{
                if(i[0]<freeStart){
                    ans.add(Arrays.asList(i[0],freeStart-1));
                }
                if(i[1]>freeEnd){
                    ans.add(Arrays.asList(freeEnd+1,i[1]));
                }
                
            }
        }
        return ans;
    }
}