// Last updated: 7/9/2026, 3:12:54 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int count=0;
        HashSet<Character>set=new HashSet<>();
        for(j=0;j<s.length();j++){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            count=Math.max(count,(j-i+1));
            
        }
        return count;
    }
}