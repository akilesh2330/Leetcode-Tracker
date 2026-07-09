// Last updated: 7/9/2026, 3:10:12 PM
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int res[]=new int[nums.length-k+1];
        int a=0;
        Deque <Integer> dq=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            if(!dq.isEmpty() && dq.peekFirst()< i-k+1) dq.pollFirst();
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i>=k-1) res[a++]=nums[dq.peekFirst()];
        }
        return res;
    }
}