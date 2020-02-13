/*
把只包含质因子2、3和5的数称作丑数（Ugly Number）。
例如6、8都是丑数，但14不是，因为它包含质因子7。 
习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
*/

import java.util.LinkedList;
public class Solution {
    public int GetUglyNumber_Solution(int n) {
        if(n <= 0)
            return 0;
        LinkedList<Integer> list = new LinkedList();
        list.add(1);
        int i = 0, j = 0, k = 0;
        while(list.size() < n){
            int min = Math.min(Math.min(list.get(i) * 2, list.get(j) * 3), list.get(k) * 5);
            list.add(min);
            if(min == list.get(i) * 2)
                i++;
            if(min == list.get(j) * 3)
                j++;
            if(min == list.get(k) * 5)
                k++;
        }
        return list.get(n - 1);
    }
}