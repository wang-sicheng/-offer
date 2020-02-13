/*
输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
*/
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.Arrays;
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        int n = pre.length;
        if(pre == null || in == null || pre.length == 0 || in.length == 0)
            return null;
        TreeNode root = new TreeNode(pre[0]);
        if(pre.length == 1)
            return root;
        int idx = findIndex(in, pre[0]);
        
        root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, idx + 1), Arrays.copyOfRange(in, 0, idx));
        root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, idx + 1, pre.length), Arrays.copyOfRange(in, idx + 1, in.length));
        return root;
    }
    
    private int findIndex(int[] in, int target){
        for(int i = 0; i < in.length; i++){
            if(in[i] == target){
                return i;
            }
        }
        return -1;
    }
}