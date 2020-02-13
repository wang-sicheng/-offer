public class Solution {
    public String ReverseSentence(String str) {
        if(str.trim().equals(""))
            return str;
        String[] split = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = split.length - 1; i >= 0; i--){
            sb.append(split[i]);
            if(i != 0)
                sb.append(" ");
        }
        return sb.toString();
    }
}