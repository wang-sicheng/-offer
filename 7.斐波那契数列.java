// 普通递归
public class Solution {
    public int Fibonacci(int n) {
        if(n <= 1)
            return n;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}

// 尾递归：当递归调用是整个函数体中最后执行的语句且它的返回值不属于表达式的一部分时，这个递归调用就是尾递归。
// 尾递归函数的特点是在回归过程中不用做任何操作，这个特性很重要，因为大多数现代的编译器会利用这种特点自动生成优化的代码。
public class Solution {
    public int Fibonacci(int n) {
        return helper(n, 0, 1);
    }
    
    private int helper(int n, int a, int b){
        if(n == 0)
            return a;
        if(n == 1)
            return b;
        return helper(n - 1, b, a + b);
    }
}

// 动态规划
public class Solution {
    public int Fibonacci(int n) {
        if(n <= 1)
            return n;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}

// 迭代 
public class Solution {
    public int Fibonacci(int n) {
        if(n <= 1)
            return n;
        int a = 0, b = 1, c = 1;
        while(--n > 0){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}