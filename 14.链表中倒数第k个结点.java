/*
输入一个链表，输出该链表中倒数第k个结点。
*/

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode p = head, q = head;
        int c = 0;
        while(p != null){
            p = p.next;
            c++;
            if(c > k)
                q = q.next;
        }
        if(c < k)
            return null;
        return q;
    }
}