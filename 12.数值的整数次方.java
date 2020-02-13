/*
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。

保证base和exponent不同时为0
*/

public class Solution {
    public double Power(double b, int e) {
        if(b == 0.0)
            return 0;
        if(e == 0)
            return 1;
        
        double product = 1.0;
        boolean isNegative = (e > 0) ? false : true;
        e = (e > 0) ? e : -e;
        while(e-- > 0){
            product *= b;
        }
        
        return isNegative ? 1.0 / product : product;
  }
} 