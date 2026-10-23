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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int ans[][]= new int[m][n];
        int top=0,bottom=m-1;
        int left=0,right=n-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){ans[top][i]=(head!=null)?head.val:-1;if(head!=null)head=head.next;}top++;
            for(int j=top;j<=bottom;j++){ans[j][right]=(head!=null)?head.val:-1;if(head!=null)head=head.next;}right--;
            if(top<=bottom){for(int i=right;i>=left;i--){ans[bottom][i]=(head!=null)?head.val:-1;if(head!=null)head=head.next;}bottom--;}
            if(left<=right){for(int j=bottom;j>=top;j--){ans[j][left]=(head!=null)?head.val:-1;if(head!=null)head=head.next;}left++;}
        }return ans;
    }
}