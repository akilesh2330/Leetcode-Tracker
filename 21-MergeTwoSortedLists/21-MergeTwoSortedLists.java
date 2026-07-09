// Last updated: 7/9/2026, 3:12:31 PM
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans=new ListNode(-1);
        ListNode temp=ans;
        while(list1!=null && list2!=null ){
            if(list1.val<list2.val){
                temp.next=new ListNode(list1.val);
                temp=temp.next;
                list1=list1.next;
            }else{
                temp.next=new ListNode(list2.val);
                temp=temp.next;
                list2=list2.next;
            }
        }
        if(list1!=null) temp.next=list1;
        if(list2!=null) temp.next=list2;
        return ans.next;
    }
}