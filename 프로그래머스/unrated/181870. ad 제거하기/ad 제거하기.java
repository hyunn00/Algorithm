import java.util.*;
class Solution {
    public List solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        for(String s : strArr) {
            if(!s.contains("ad"))
                answer.add(s);
        }
        return answer;
    }
}