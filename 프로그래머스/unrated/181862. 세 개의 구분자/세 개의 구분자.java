import java.util.*;
class Solution {
    public List solution(String myStr) {
        String[] spl = myStr.split("[a|b|c]+");

        List<String> answer = new ArrayList<>();
        
        if(spl.length == 0) {
            answer.add("EMPTY");
            return answer;
        }
        
        for(String s : spl) {
            if(s.equals("")) continue;
            answer.add(s);
        }
        
        return answer;
    }
}