// Last updated: 7/9/2026, 3:11:38 PM
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        method(ans, n, k, new ArrayList<>(), 1);
        return ans;
    }
    void method(List<List<Integer>> ans,int n,int k,List<Integer> temp,int start) {
        if(temp.size() == k) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = start; i <= n; i++) {
            temp.add(i);
            method(ans, n, k, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}