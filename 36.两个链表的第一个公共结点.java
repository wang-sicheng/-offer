/*
输入两个链表，找出它们的第一个公共结点。
*/

public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode p1 = pHead1, p2  = pHead2;
        while(p1 != p2){
            p1 = (p1 == null) ? pHead2 : p1.next;
            p2 = (p2 == null) ? pHead1 : p2.next;
        }
        return p1;
    }
}

import java.util.*;
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        Set<ListNode> set = new HashSet();
        ListNode p = pHead1, q = pHead2;
        while(p != null){
            set.add(p);
            p = p.next;
        }
        while(q != null){
            if(set.contains(q))
                return q;
            q = q.next;
        }
        return null;
    }
}