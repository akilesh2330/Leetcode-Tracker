// Last updated: 7/9/2026, 3:07:34 PM
import java.util.*;
class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        List<Integer> values = new ArrayList<>(freq.keySet());
        Collections.sort(values);

        for (int i = 0; i < values.size(); i++) {
            int x = values.get(i);
            for (int j = i + 1; j < values.size(); j++) {
                int y = values.get(j);
                if (!freq.get(x).equals(freq.get(y))) {
                    return new int[]{x, y};
                }
            }
        }
        return new int[]{-1, -1};
    }
}