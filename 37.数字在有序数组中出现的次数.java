/*
统计一个数字在排序数组中出现的次数。
*/

public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int idx = binarySearch(array, k);
        if(idx == -1)
            return 0;
        int i = idx, j = idx, ans = 0;
        while(--i >= 0){
            ans += (array[i] == k) ?  1 : 0;
        }
        while(++j < array.length){
            ans += (array[j] == k) ? 1 : 0;
        }
        return ans + 1;
    }
    
    private int binarySearch(int[] array, int k){
        int low = 0, high = array.length  - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(array[mid] == k)
                return mid;
            else if(array[mid] < k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}