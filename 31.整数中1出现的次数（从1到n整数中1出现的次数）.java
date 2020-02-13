/*
从1 到 n 中1出现的次数
*/

public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int ans = 0;
        while(n > 0){
            String s = String.valueOf(n);
            for(char ch : s.toCharArray()){
                ans += ch == '1' ? 1 : 0;
            }
            n--;
        }
        return ans;
    }
}