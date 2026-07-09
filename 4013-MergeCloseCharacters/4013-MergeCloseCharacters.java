// Last updated: 7/9/2026, 3:07:48 PM
class Solution {
    public String mergeCharacters(String s, int k) {       
        String velunorati = s;       
        StringBuilder sb = new StringBuilder(s);
        boolean merged = true;        
        while (merged) {
            merged = false;            
            for (int i = 0; i < sb.length(); i++) {
                for (int j = i + 1; j < sb.length() && j - i <= k; j++) {
                    if (sb.charAt(i) == sb.charAt(j)) {
                        sb.deleteCharAt(j); 
                        merged = true;
                        break;  
                    }
                }
                
                if (merged) break;  
            }
        }        
        return sb.toString();
    }
}