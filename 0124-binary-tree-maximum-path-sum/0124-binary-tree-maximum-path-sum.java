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
    public int maxPathSum(TreeNode root) {

        int[] maxi=new int[1];
        maxi[0]=Integer.MIN_VALUE;
        max_path(root,maxi);
        return maxi[0];
    }
    int max_path(TreeNode root ,int[] maxi)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=Math.max(0,max_path(root.left,maxi));
        int rh=Math.max(0,max_path(root.right,maxi));
        maxi[0]=Math.max(maxi[0],lh+rh+root.val);

        return root.val+Math.max(lh,rh);
    }
}