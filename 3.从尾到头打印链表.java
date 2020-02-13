/*
输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
*/

/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/

import java.util.Collections;
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ans = new ArrayList();
        while(listNode != null){
            ans.add(listNode.val);
            listNode = listNode.next;
        }
        Collections.reverse(ans);
        return ans;
    }
}

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ans = new ArrayList();
        while(listNode != null){
            ans.add(0, listNode.val);
            listNode = listNode.next;
        }
        return ans;
    }
}