/*
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
*/

public class Solution {
    public void reOrderArray(int [] array) {
        int n = array.length;
        int[] dup = new int[n];
        int i = 0, j = n - 1;
        for(int k = 0; k < n; k++){
            if((array[k] & 1) == 1)
                dup[i++] = array[k];
            if((array[n - k - 1] & 1) == 0)
                dup[j--] = array[n - k - 1];
        }
        for(int k = 0; k < n; k++)
            array[k] = dup[k];
    }
}