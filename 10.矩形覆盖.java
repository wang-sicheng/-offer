/*
我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
*/

// 普通递归
public class Solution {
    public int RectCover(int n) {
        if(n <= 2)
            return n;
        return RectCover(n - 1) + RectCover(n - 2);
    }
}

// 尾递归
public class Solution {
    public int RectCover(int n) {
        return helper(n, 1, 2);
    }
     
    private int helper(int n, int a, int b){
        if(n == 0)
            return 0;
        if(n == 1)
            return a;
        if(n == 2)
            return b;
        return helper(n - 1, b, a + b);
    }
}