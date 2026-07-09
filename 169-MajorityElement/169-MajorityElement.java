// Last updated: 7/9/2026, 3:10:50 PM
import java.util.Scanner;
class Solution {
    public int majorityElement(int[] nums) {
        Scanner s=new Scanner(System.in);
        int a=0;
        int b=0;
        for(int c:nums){
            if(b==0){
                a=c;
            }
            if(c==a){
                b++;
            }else{
                b--;
            }
        }
        return a;
    }
}