/*
写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
*/

public class Solution {
    public int Add(int num1,int num2) {
        while(num2 != 0){
            int n1 = num1 ^ num2;
            int n2 = (num1 & num2) << 1;
            num1 = n1;
            num2 = n2;
        }
        return num1;
    }
}


public class Solution {
    public int Add(int num1,int num2) {
        int n1, n2;
        n1 = (num1 & num2) << 1;
        n2 = num1 ^ num2;
        while((n1 & n2) != 0){
            return Add(n1, n2);
        }
         
        return n1 | n2;
    }
}

public class Solution {
    public int Add(int num1,int num2) {
        int n1, n2;
        n1 = (num1 & num2) << 1;
        n2 = num1 ^ num2;
        while((n1 & n2) != 0){
            num1 = n1;
            num2 = n2;
            n1 = (num1 & num2) << 1;
            n2 = num1 ^ num2;
        }
         
        return n1 | n2;
    }
}