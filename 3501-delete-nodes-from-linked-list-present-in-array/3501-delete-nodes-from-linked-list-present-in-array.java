/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> a= new HashSet<>();
        for(int i: nums){
            a.add(i);
        }
        ListNode d= new ListNode(0);
        d.next=head;
        ListNode pre=d;
       ListNode curr=head;
       while(curr!=null){
        if(a.contains(curr.val)){
            pre.next=curr.next;
        }
        else{
            pre=curr;
        }
        curr=curr.next;
       }
       return d.next;
    }
}