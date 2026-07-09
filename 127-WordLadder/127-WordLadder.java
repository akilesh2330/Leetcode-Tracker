// Last updated: 7/9/2026, 3:11:07 PM
class Solution {
    public int ladderLength(String beginWord,String endWord,List<String> wordList) {
        Set<String> s = new HashSet<>(wordList);
        if(beginWord.equals(endWord)) {
            return 0;
        }
        if(s.contains(endWord) == false) {
            return 0;
        }
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        int level = 1;
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                String word = q.poll();
                if(word.equals(endWord)) {
                    return level;
                }
                char[] arr = word.toCharArray();
                for(int j = 0; j < arr.length; j++) {
                    char original = arr[j];
                    for(char c = 'a'; c <= 'z'; c++) {
                        arr[j] = c;
                        String newWord = new String(arr);
                        if(s.contains(newWord)) {
                            q.offer(newWord);
                            s.remove(newWord);
                        }
                    }
                    arr[j] = original;
                }
            }
            level++;
        }
        return 0;
    }
}