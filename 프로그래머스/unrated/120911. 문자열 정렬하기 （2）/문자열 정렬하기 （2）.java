import java.util.*;
class Solution {
    public String solution(String my_string) {
        String[] answer = my_string.toLowerCase().split("");
        Arrays.sort(answer);
        String str = String.join("", answer);
        return str;
    }
}