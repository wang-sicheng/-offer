/*
输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
*/

// 递归
public class Solution {
    public boolean VerifySquenceOfBST(int [] seq) {
        if(seq.length == 0)
            return false;
        return isLastOrder(seq, 0, seq.length - 1);
    }
     
    private boolean isLastOrder(int[] seq, int start, int end){
        if(start == end)
            return true;
         
        int rootVal = seq[end], mid = start;
        while(seq[mid] < rootVal && mid < end)
            mid++;
         
        int tmp = mid;
        while(seq[tmp] > rootVal && tmp < end)
            tmp++;
         
        if(tmp != end)
            return false;
         
        if(mid == start || mid == end)
            return isLastOrder(seq, start, end - 1);
        else
            return isLastOrder(seq, start, mid - 1) && isLastOrder(seq, mid, end - 1);
    }
}

// 非递归
public class Solution {
    public boolean VerifySquenceOfBST(int [] seq) {
        int n = seq.length;
        if(n == 0)
            return false;
        
        while(--n > 0){
            int i = 0;
            while(seq[i] < seq[n])
                i++;
            
            while(seq[i] > seq[n])
                i++;
            
            if(i != n)
                return false;
        }
        return true;
    }
}