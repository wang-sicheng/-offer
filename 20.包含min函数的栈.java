/*
定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数
（时间复杂度应为O（1））。
*/

import java.util.Stack;
public class Solution {
    private Stack<Integer> s = new Stack();
    private Stack<Integer> sMin = new Stack();
    
    public void push(int node) {
        s.push(node);
        if(sMin.isEmpty() || sMin.peek() >= node){
            sMin.push(node);
        }
    }
    
    public void pop() {
        if(sMin.peek() == s.pop()){
            sMin.pop();
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int min() {
        return sMin.peek();
    }
}


import java.util.Stack;
import java.util.Iterator;
 
public class Solution {
    Stack<Integer> stack = new Stack();
     
    public void push(int node) {
        stack.push(node);
    }
     
    public void pop() {
        stack.pop();
    }
     
    public int top() {
        return stack.peek();
    }
     
    public int min() {
        int min = Integer.MAX_VALUE;
        Iterator<Integer> it = stack.iterator();
        while(it.hasNext()){
            int next = it.next();
            if(min > next){
                min = next;
            }
        }
        return min;
    }
}