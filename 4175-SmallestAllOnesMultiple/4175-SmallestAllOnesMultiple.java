// Last updated: 7/9/2026, 3:07:44 PM
import java.util.Scanner;
class Solution {
    public int minAllOneMultiple(int k) {
        Scanner sc=new Scanner(System.in);
        if(k%2==0||k%5==0){
            return -1;
        }
        int r=0;
        for(int length=1;length<=k;length++){
            r=(r*10+1)%k;
            if(r==0){
                return length;
            }
        }
        return -1;
    }
}