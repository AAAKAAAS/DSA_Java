/**
 * Definition for a binary tree node.
  * public class TreeNode {
   *     int val;
    *     TreeNode left;
     *     TreeNode right;
      *     TreeNode(int x) { val = x; }
       * }
        */
        
        import java.util.*;
        
        class Solution {
            public TreeNode createBinaryTree(int[][] descriptions) {
                    Map<Integer, TreeNode> map = new HashMap<>();
                            Set<Integer> children = new HashSet<>();
                            
                                    // Step 1: Create nodes and build relationships
                                            for (int[] desc : descriptions) {
                                                        int parentVal = desc[0];
                                                                    int childVal = desc[1];
                                                                                int isLeft = desc[2];
                                                                                
                                                                                            // Create parent if not exist
                                                                                                        map.putIfAbsent(parentVal, new TreeNode(parentVal));
                                                                                                                    // Create child if not exist
                                                                                                                                map.putIfAbsent(childVal, new TreeNode(childVal));
                                                                                                                                
                                                                                                                                            // Link parent and child
                                                                                                                                                        if (isLeft == 1) {
                                                                                                                                                                        map.get(parentVal).left = map.get(childVal);
                                                                                                                                                                                    } else {
                                                                                                                                                                                                    map.get(parentVal).right = map.get(childVal);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                
                                                                                                                                                                                                                            // Mark child
                                                                                                                                                                                                                                        children.add(childVal);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                        // Step 2: Find root (the one not present in children set)
                                                                                                                                                                                                                                                                TreeNode root = null;
                                                                                                                                                                                                                                                                        for (int val : map.keySet()) {
                                                                                                                                                                                                                                                                                    if (!children.contains(val)) {
                                                                                                                                                                                                                                                                                                    root = map.get(val);
                                                                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                                                                return root;
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                    