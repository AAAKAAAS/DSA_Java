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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)return head;
        List<Integer>a = new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            a.add(curr.val);
            curr=curr.next;
            
        }
        Collections.sort(a);
        curr=head;
        int i=0;
        while(curr!=null){
        curr.val=a.get(i++);
        curr=curr.next;
        }
        return head;
    }
}