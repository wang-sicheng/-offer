/*
输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
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
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        if(list1.val < list2.val){
            list1.next = Merge(list1.next, list2);
            return list1;
        }else{
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }
}

public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode p = list1, q = list2, newHead = new ListNode(0), k = newHead;
        while(p != null && q != null){
            if(p.val < q.val){
                k.next = p;
                p = p.next;
            }else{
                k.next = q;
                q = q.next;
            }
            k = k.next;
        }
        if(p == null && q != null){
            k.next = q;
        }else{
            k.next = p;
        }
        return newHead.next;
    }
}