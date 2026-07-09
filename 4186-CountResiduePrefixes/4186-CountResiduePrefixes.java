// Last updated: 7/9/2026, 3:07:40 PM
class Solution {
    public int residuePrefixes(String s) {
        boolean[] m=new boolean[26];
        int a=0;
        int b=0;
        for(int i=0;i<s.length();i++){
            int d=s.charAt(i)-'a';
            if(!m[d]){
                m[d]=true;
                a++;
            }
            int h=i+1;
            if(a==h%3){
                b++;
            }
        }
        return b;
        
    }
}