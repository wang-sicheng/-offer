/*
输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
如果有多对数字的和等于S，输出两个数的乘积最小的。
*/

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> ans = new ArrayList();
        int low = 0, high = array.length - 1;
        while(high > low){
            if(array[high] + array[low] == sum){
                ans.add(array[low]);
                ans.add(array[high]);
                return ans;
            }else if(array[high] + array[low] < sum){
                low++;
            }else{
                high--;
            }
        }
        return new ArrayList();
    }
}