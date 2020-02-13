/*
在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留
，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
*/

public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null)
            return null;
        ListNode p = pHead.next;
        if(p != null && pHead.val == p.val){
            while(p != null && p.val == pHead.val){
                p = p.next;
            }
            return deleteDuplication(p);
        }else{
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }
}