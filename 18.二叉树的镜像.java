/*
操作给定的二叉树，将其变换为源二叉树的镜像。
*/

public class Solution {
    public void Mirror(TreeNode root) {
        if(root != null){
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
             
            Mirror(root.left);
            Mirror(root.right);
        }
    }
}

import java.util.Queue;
import java.util.LinkedList;
public class Solution {
    public void Mirror(TreeNode root) {
        if(root == null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
            if(node.left != null)
                queue.offer(node.left);
            if(node.right != null)
                queue.offer(node.right);
        }
    }
}