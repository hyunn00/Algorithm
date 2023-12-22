import java.util.*;
class Solution {
    public List solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();
        
        for(String line : picture) {
            String s = "";
            for(int i=0; i<line.length(); i++) {
                for(int j=0; j<k; j++) {
                    s += line.charAt(i);
                }
            }
            for(int j=0; j<k; j++) {
                answer.add(s);
            }
        }
        return answer;
    }
}