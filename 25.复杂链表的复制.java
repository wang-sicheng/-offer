/*
输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
*/

/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null)
            return null;
        RandomListNode p = pHead;
        // 为每一个结点新建一个副本，紧接在原结点之后
        while(p != null){
            RandomListNode nNode = new RandomListNode(p.label);
            nNode.next = p.next;
            p.next = nNode;
            p = nNode.next;
        }
        
        p = pHead;
        while(p != null){
            if(p.random != null){
                p.next.random = p.random.next;
            }
            p = p.next.next;
        }
        
        RandomListNode newHead = new RandomListNode(-1), oldHead = new RandomListNode(-1), np = newHead, op = oldHead;
        p = pHead;
        int count = 0;
        
        // 分离原结点和新结点
        while(p != null){
            if((count & 1) == 0){
                op.next = p;
                op = op.next;
            }else{
                np.next = p;
                np = np.next;
            }
            p = p.next;
            count++;
        }
        np.next = null;
        op.next = null;
        return newHead.next;
    }
}