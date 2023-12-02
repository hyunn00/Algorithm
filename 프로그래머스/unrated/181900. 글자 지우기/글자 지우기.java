import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        char[] strToCharArr = my_string.toCharArray();
        for(int i : indices) {
            strToCharArr[i] = ' ';
        }
        for(int s : strToCharArr) {
            if(s != ' ') {
                answer += (char)(s);
            }
        }
        return answer;
    }
}