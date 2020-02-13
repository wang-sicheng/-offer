/*
请实现两个函数，分别用来序列化和反序列化二叉树

二叉树的序列化是指：把一棵二叉树按照某种遍历方式的结果以某种格式保存为字符串，
从而使得内存中建立起来的二叉树可以持久保存。
序列化可以基于先序、中序、后序、层序的二叉树遍历方式来进行修改，序列化的结果是一个字符串，
序列化时通过 某种符号表示空节点（#），以 ！ 表示一个结点值的结束（value!）。

二叉树的反序列化是指：根据某种遍历顺序得到的序列化字符串结果str，重构二叉树。
*/

import java.util.*;
public class Solution {
    String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node == null)
                sb.append("#!");
            else{
                sb.append(node.val);
                sb.append('!');
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        return sb.toString();
  }
    TreeNode Deserialize(String str) {
       if(str == null || str.charAt(0) == '#')
           return null;
        String[] split = str.split("!");
        TreeNode root = new TreeNode(Integer.valueOf(split[0]));
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        int i = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int j = 0; j < size; j++){
                TreeNode node = queue.poll();
                if(split[i].equals("#")){
                    node.left = null;
                 }else{
                    node.left = new TreeNode(Integer.valueOf(split[i]));
                    queue.offer(node.left);
                }
                i++;
                if(split[i].equals("#")){
                    node.right = null;
                 }else{
                    node.right = new TreeNode(Integer.valueOf(split[i]));
                    queue.offer(node.right);
                }
                i++;
            }
        }
        return root;
  }
}