/*
给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1），
每段绳子的长度记为k[0],k[1],...,k[m]。请问k[0]xk[1]x...xk[m]可能的最大乘积是多少？
例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
*/

// 动态规划
public class Solution {
    public int cutRope(int n) {
        if(n == 2)
            return 1;
        if(n == 3)
            return 2;
        
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        
        for(int i = 4; i <= n; i++){
            for(int j = 1; j <= i / 2; j++){
                dp[i] =  Math.max(dp[i], dp[j] * dp[i - j]);
            }
        }
        return dp[n];
    }
}

// 贪心
public class Solution {
    public int cutRope(int n) {
        if(n == 2)
            return 1;
        if(n == 3)
            return 2;
        int times = n / 3, remainder = n % 3;
        if(remainder == 0)
            return (int)Math.pow(3, times);
        else if(remainder == 1)
            return (int)Math.pow(3, times - 1) * 4;
        else
            return (int)Math.pow(3, times) * 2;
    }
}