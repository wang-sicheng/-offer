/*
给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？
(子向量的长度至少是1)
*/

public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int sum = 0, max = Integer.MIN_VALUE;
        for(int a : array){
            sum += a;
            if(sum > max)
                max = sum;
            if(sum < 0)
                sum = 0;
        }
        return max;
    }
}