/*
请实现一个函数，用来判断一颗二叉树是不是对称的。
注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
*/

public class Solution {
    boolean isSymmetrical(TreeNode pRoot)
    {
        return pRoot == null || judge(pRoot.left, pRoot.right);
    }
     
    boolean judge(TreeNode n1, TreeNode n2){
        if(n1 == null && n2 == null)
            return true;
        else if(n1 == null || n2 == null)
            return false;
         
        if(n1.val != n2.val)
            return false;
        else
            return judge(n1.left, n2.right) && judge(n1.right, n2.left);
    }
}