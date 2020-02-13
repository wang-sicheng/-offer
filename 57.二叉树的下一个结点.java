/*
给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
*/

/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode tar)
    {
        if(tar.right != null){
            TreeLinkNode p = tar.right;
            while(p.left != null)
                p = p.left;
            return p;
        }else if(tar.next == null){
            return null;
        }else if(tar.next.left == tar){
            return tar.next;
        }else {
            TreeLinkNode q = tar.next;
            while(q.next != null){
                if(q.next.left == q)
                    return q.next;
                q = q.next;
            }
            return null;
        }
    }
}