/*
输入n个整数，找出其中最小的K个数。
例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
*/

import java.util.*;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(k == 0 || k > input.length)
            return new ArrayList();
        Queue<Integer> queue = new PriorityQueue(new Comparator<Integer> (){
            @Override
            public int compare(Integer a, Integer b){
                return b - a;
            }
        });
        for(int i : input){
            if(queue.size() < k)
                queue.offer(i);
            else if(queue.peek() > i){
                queue.poll();
                queue.offer(i);
            }
        }
        ArrayList<Integer> ans = new ArrayList();
        ans.addAll(queue);
        /*Iterator<Integer> it = queue.iterator();
        while(it.hasNext()){
            ans.add(it.next());
        }*/
        return ans;
    }
}