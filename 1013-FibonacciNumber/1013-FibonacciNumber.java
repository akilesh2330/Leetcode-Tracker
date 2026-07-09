// Last updated: 7/9/2026, 3:09:09 PM
class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }
}