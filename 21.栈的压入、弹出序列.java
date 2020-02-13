/*
输入两个整数序列，第一个序列表示栈的压入顺序，
请判断第二个序列是否可能为该栈的弹出顺序。
*/

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] A,int [] B) {
        Stack<Integer> s = new Stack();
        int n = A.length;
        int i = 0, j = 0;
        while(i < n && j < n){
            s.push(A[i++]);
            while(!s.isEmpty() && s.peek() == B[j]){
                s.pop();
                j++;
            }
        }
        return j == n;
    }
}