import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] text = s.split("(?<=\\s)");
        System.out.println(Arrays.toString(text));
        for(int i=0; i<text.length; i++) {
            text[i] = text[i].toLowerCase();
            if(text[i].length() != 0)
                text[i] = text[i].substring(0, 1).toUpperCase() + text[i].substring(1);
        }
        answer = String.join("", text);
        return answer;
    }
}