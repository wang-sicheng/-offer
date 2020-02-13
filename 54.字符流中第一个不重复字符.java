/*
请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
输出描述:
如果当前字符流没有存在出现一次的字符，返回#字符。
*/

public class Solution {
    int[] count = new int[256]; // 字符出现的次数
    int[] index = new int[256]; // 字符出现的顺序
    int number = 0;
 
    public void Insert(char ch) {
        count[ch]++;
        index[ch] = number++;
    }
 
    public char FirstAppearingOnce() {
        int minIndex = number;
        char ch = '#';
        for (int i = 0; i < 256; i++) {  // !!!
            if (count[i] == 1 && index[i] < minIndex) {
                ch = (char) i;
                minIndex = index[i];
            }
        }
        return ch;
    }
}


public class Solution {
    //Insert one char from stringstream
    Set<Character> set = new HashSet();
    LinkedList<Character> list = new LinkedList();
     
    public void Insert(char ch)
    {
        if(!set.contains(ch)){
            list.offer(ch);
            set.add(ch);
        }else{
            set.remove(ch);
        }
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        while(!list.isEmpty()){
            if(set.contains(list.getFirst()))
                return list.getFirst();
            else
                list.pollFirst();
        }
         
        return '#';
    }
}