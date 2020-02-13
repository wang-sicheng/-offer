/*
给定一棵二叉搜索树，请找出其中的第k小的结点。
例如，(5，3，7，2，4，6，8)中，按结点数值大小顺序第三小结点的值为4。
*/


public class Solution {
    int count = 0;
    TreeNode KthNode(TreeNode root, int k)
    {
        if(root == null || k == 0){
            return null;
        }
        TreeNode node = KthNode(root.left, k);
        if(node != null)
            return node;
        
        count++;
        if(count == k)
            return root;
        
        node = KthNode(root.right, k);
        if(node != null)
            return node;
        
        return null;
    }
}