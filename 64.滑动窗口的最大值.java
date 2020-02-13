/*
给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，
那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}； 
针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， 
 {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， 
 {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
*/

import java.util.*;
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        if(num == null || num.length == 0 || size <= 0)
            return new ArrayList();
        
        LinkedList<Integer> deque = new LinkedList();
        ArrayList<Integer> ans = new ArrayList();
        for(int i = 0; i < num.length; i++){
            while(!deque.isEmpty() && num[deque.peekLast()] < num[i])
                deque.pollLast();
            deque.add(i);
            if(deque.peekFirst() == i - size)
                deque.pollFirst();
            
            if(i >= size - 1)
                ans.add(num[deque.peekFirst()]);
        }
        return ans;
    }
} 


import java.lang.Math;
import java.util.*;
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        if(num == null || num.length == 0 || size == 0)
            return new ArrayList();
        ArrayList<Integer> ans = new ArrayList();
        for(int i = 0; i < num.length - size + 1; i++){
            int max = num[i];
            for(int j = i; j < i + size; j++){
                max = Math.max(max, num[j]);
            }
            ans.add(max);
        }
        return ans;
    }
}