/*
对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。
*/

// YX = (XTyT)T
public class Solution {
    public String LeftRotateString(String str,int n) {
        int len = str.length();
        if(len == 0 || n % len == 0)
            return str;
        n %= len;
        StringBuilder sb = new StringBuilder();
        for(int i = n - 1; i >= 0; i--){
            sb.append(str.charAt(i));
        }
        for(int i = len - 1; i >= n; i--){
            sb.append(str.charAt(i));
        }
        return sb.reverse().toString();
    }
}


public class Solution {
    public String LeftRotateString(String str,int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(n));
        sb.append(str.substring(0, n));
        return sb.toString();
    }
}