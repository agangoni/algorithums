//https://leetcode.com/problems/binary-tree-maximum-path-sum/
public class BinaryTreeMaximumPathSum {
  public static void main(String[] args) {
    
  }
  
  public int maxPathSum(TreeNode root) {
        
  }
  ////     1,6
//    / \
//   2   3
   
   

           
//BFS           
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
class Solution {
  
  private maxPath = Integer.MIN_VALUE;
  
    public int maxPathSum(TreeNode root) {
      
      recursePathSum(root);
      return maxPath;
      
        
    }
  
    public int recursePathSum(TreeNode node) {
        if(node==null){
          return 0;
        }
      
      
      int l = recursePathSum(node.left);
      int r = recursePathSum(node.right);
      
      int curSum = node.val + l + r;//18
      maxPath=Max.max(currSum,maxPath);//compare maxPath with currSum
      
      int maxChild = Math.max(l,r);//2
      
      return node.val + maxChild;
      
    }
  
// 				  -10
// 				  /  \
// 				 9     20
// 				    /      \
// 				   15,18    7
//          / \      / \
//         1   2    3   4
}
}
