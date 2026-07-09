// Last updated: 7/9/2026, 3:07:55 PM
class Solution {
public:
    bool canAliceWin(vector<int>& nums) {
        int sd=0;
        int dd=0;
        for(int x:nums){
            if(x<10) sd+=x;
            else dd+=x;
        }
        return sd!=dd;
    }
};