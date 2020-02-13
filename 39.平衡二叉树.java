/*
输入一棵二叉树，判断该二叉树是否是平衡二叉树。
*/

public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        return depth(root) != -1;
    }
    
    private int depth(TreeNode node){
        if(node == null)
            return 0;
        int left = depth(node.left);
        if(left == -1)
            return -1;
        int right = depth(node.right);
        if(right == -1)
            return -1;
        
        return Math.abs(left - right) > 1 ? -1 : Math.max(left, right) + 1;
    }
}

import java.lang.Math;
public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
         if(root ==  null)
             return true;
         int diff = Math.abs(depth(root.left) - depth(root.right));
         if(diff > 1)
             return  false;
         return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }
     
    private int depth(TreeNode node){
        if(node== null)
            return 0;
        return Math.max(depth(node.left), depth(node.right)) + 1;
    }
}