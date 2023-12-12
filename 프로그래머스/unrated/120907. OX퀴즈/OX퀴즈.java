import java.util.*;
class Solution {
    public List solution(String[] quiz) {
        List<String> answer = new ArrayList<>();
        for(String s : quiz) {
            String[] str = s.split(" ");
            int n1 = Integer.parseInt(str[0]);
            int n2 = Integer.parseInt(str[2]);
            int n3 = Integer.parseInt(str[4]);
            if(str[1].equals("-")) {
                if((n1-n2) == n3) answer.add("O");
                else answer.add("X");
            } else {
                if((n1+n2) == n3) answer.add("O");
                else answer.add("X");
            }
        }
        return answer;
    }
}