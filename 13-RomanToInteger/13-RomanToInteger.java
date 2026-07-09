// Last updated: 7/9/2026, 3:12:38 PM
import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> value = new HashMap<>();
        value.put('I', 1);
        value.put('V', 5);
        value.put('X', 10);
        value.put('L', 50);
        value.put('C', 100);
        value.put('D', 500);
        value.put('M', 1000);
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = value.get(s.charAt(i));
            if (i < s.length() - 1 &&
                curr < value.get(s.charAt(i + 1))) {
                ans -= curr;
            } else {
                ans += curr;
            }
        }

        return ans;
    }
}