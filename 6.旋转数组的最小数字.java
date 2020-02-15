/*
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
*/
import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0)
            return 0;
        for(int i = 1; i < array.length; i++){
            if(array[i] < array[i - 1])
                return array[i];
        }
        return array[0];
    }
}

import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array == null || array.length == 0)
            return 0;
        int n = array.length;
        if(array[n - 1] > array[0])
            return array[0];
        
        int low = 0, high = n - 1, mid = 0;
        while(array[low] >= array[high]){
            if(high == low + 1)
                return array[high];
            mid = (high + low) / 2;
            // {0, 1, 1, 1, 1} == > {1, 0, 1, ,1 ,1}  {1, 1, 1, 0, 1}
            if(array[low] == array[high] && array[mid] == array[low]){
                return minInOrder(array, low, high);
            }else if(array[low] <= array[mid]){
                low = mid;
            }else if(array[mid] <= array[high]){
                high = mid;
            }
        }
        return  array[mid];
    }
    
    private int minInOrder(int[] array, int low, int high){
        int min = array[low];
        for(int i = low; i <= high; i++){
            min = (min < array[i]) ? min : array[i];
        }
        return min;
    }
}