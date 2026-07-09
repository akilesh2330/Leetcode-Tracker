// Last updated: 7/9/2026, 3:12:14 PM
class Solution {
    public List<List<Integer>> combinationSum2(int[] n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(n);
        List<Integer> temp = new ArrayList<>();
        method(ans, n, k, temp, 0);
        return ans;
    }
    void method(List<List<Integer>> ans,int[] arr,int required,List<Integer> temp,int start) {
        if(required == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(required < 0) {
            return;
        }
        for(int i = start; i < arr.length; i++) {
            if(i > start && arr[i] == arr[i - 1]) {
                continue;
            }
            temp.add(arr[i]);
            method(ans,arr,required - arr[i],temp,i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}