// Last updated: 7/9/2026, 3:07:58 PM
import java.util.Scanner;
class Solution {
    public int minimumOperations(int[] nums) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        for(int x:nums){
            if(x%3!=0){
                count++;
            }
        }
        return count;

        
    }
}