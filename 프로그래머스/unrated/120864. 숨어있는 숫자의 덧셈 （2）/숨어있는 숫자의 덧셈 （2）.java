import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split("[a-z|A-Z]+");
        for(String s : arr) {
            if(!s.equals(""))
                answer += Integer.parseInt(s);
        }
        return answer;
    }
}