// Last updated: 7/9/2026, 3:09:42 PM
class Solution {
    HashMap<String, Integer> map = new HashMap<>();
    public int recursive(String s, int left, int right) {
        if (left > right)
            return 0;
        if (left == right)
            return 1;
        String t = left + "," + right;
        if (map.containsKey(t))
            return map.get(t);
        int ans;
        if (s.charAt(left) == s.charAt(right))
            ans = 2 + recursive(s, left + 1, right - 1);
        else
            ans = Math.max(
                    recursive(s, left + 1, right),
                    recursive(s, left, right - 1));
        map.put(t, ans);
        return ans;
    }
    public int longestPalindromeSubseq(String s) {

        return recursive(s, 0, s.length() - 1);

    }
}