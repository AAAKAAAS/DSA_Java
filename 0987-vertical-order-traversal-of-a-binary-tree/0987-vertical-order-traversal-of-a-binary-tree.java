/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class tuple{
    TreeNode node;
    int row;
    int col;
    tuple(TreeNode n,int r,int c){
        node=n;
        row=r;
        col=c;
    }
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
       TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map= new TreeMap<>();
       Queue<tuple> q= new LinkedList<>();
       q.offer(new tuple(root,0,0));
       while(!q.isEmpty()){
        tuple t=q.poll();
        TreeNode n=t.node;
        int r=t.row;
        int c=t.col;
        map.putIfAbsent(c,new TreeMap<>());
        map.get(c).putIfAbsent(r,new PriorityQueue<>());
        map.get(c).get(r).offer(n.val);
        if(n.left!=null)q.offer(new tuple(n.left,r+1,c-1));
        if(n.right!=null)q.offer(new tuple(n.right,r+1,c+1));
       } 
       List<List<Integer>> x = new ArrayList<>();
       for(TreeMap<Integer,PriorityQueue<Integer>> A :map.values()){
        List<Integer> y = new ArrayList<>();
        for(PriorityQueue<Integer> B:A.values()){
           while(!B.isEmpty()) y.add(B.poll());
        }
        x.add(y);
       }
       return x;
    }
}