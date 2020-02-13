/*
输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
*/

import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList();
        int low = 1, high = 2;
        while(high  > low){
            int s = (high + low) * (high - low + 1) / 2;
            if(s == sum){
                ArrayList<Integer> list = new ArrayList();
                for(int i = low; i <= high; i++){
                    list.add(i);
                }
                ans.add(list);
                low++;
            }else if(s < sum){
                high++;
            }else{
                low++;
            }
        }
        return ans;
    }
}