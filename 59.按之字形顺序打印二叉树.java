/*
请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
*/

import java.util.ArrayList;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
import java.util.Stack;
public class Solution {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        if(pRoot == null)
            return new ArrayList();
        Stack<TreeNode> s1 = new Stack(), s2 = new Stack();
        ArrayList<ArrayList<Integer>> ans = new ArrayList();
        s1.push(pRoot);
        while(!s1.isEmpty() || !s2.isEmpty()){
            TreeNode node = null;
            ArrayList<Integer> row = new ArrayList();
            while(!s1.isEmpty()){
                node = s1.pop();
                row.add(node.val);
                if(node.left != null)
                    s2.push(node.left);
                if(node.right != null)
                    s2.push(node.right);
            }
            if(!row.isEmpty())
                ans.add(row);
            
            ArrayList<Integer> row2 = new ArrayList();
            while(!s2.isEmpty()){
                node = s2.pop();
                row2.add(node.val);
                if(node.right != null)
                    s1.push(node.right);
                if(node.left != null)
                    s1.push(node.left);
            }
            if(!row2.isEmpty())
                ans.add(row2);
        }
        return ans;
    }
}