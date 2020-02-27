/*
输入一个字符串,按字典序打印出该字符串中字符的所有排列。
例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
*/

import java.util.*;
public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> ans = new ArrayList<>();
        if(str == null || str.length() == 0)
            return ans;
        
        PermutationHelper(str.toCharArray(), 0, ans);
        Collections.sort(ans);
        return ans;
    }
    
    public  void PermutationHelper(char[] arr, int i, ArrayList<String> ans){
         if(i == arr.length - 1){
             ans.add(String.valueOf(arr));
         }else{
             Set<Character> set = new HashSet<>();
             for(int j = i; j < arr.length; j++){
                 if(j == i || !set.contains(arr[j])){
                     set.add(arr[j]);
                     swap(arr, i, j);
                     PermutationHelper(arr, i + 1, ans);
                     swap(arr, j, i);
                 }
             }
         }
         
             
    }
    
    public void swap(char[] arr, int i, int j){
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}