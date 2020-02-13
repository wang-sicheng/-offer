/*
给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
*/

public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null)
            return null;
        ListNode fast = pHead, slow = pHead;
        boolean isLoop = false;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                isLoop = true;
                break;
            }
        }
        if(!isLoop)
            return null;
        
        int count = 1;
        slow = slow.next;
        while(fast != slow){
            slow = slow.next;
            count++;
        }
        
        ListNode p = pHead, q = pHead;
        while(count-- > 0){
            p = p.next;
        }
        while(p != q){
            p = p.next;
            q = q.next;
        }
        return p;
    }
}