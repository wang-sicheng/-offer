/*
从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
*/

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Solution {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        if(pRoot == null)
            return new ArrayList();
        Queue<TreeNode> queue = new LinkedList();
        ArrayList<ArrayList<Integer>> ans = new ArrayList();
        queue.offer(pRoot);
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> row = new ArrayList();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                row.add(node.val);
                if(node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
            }
            ans.add(row);
        }
        return ans;
    }
    
}