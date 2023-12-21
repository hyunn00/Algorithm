import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] possible = {"aya", "ye", "woo", "ma"};
        for(int i=0; i<babbling.length; i++) {
            for(int k=0; k<possible.length; k++) {
                babbling[i] = babbling[i].replace(possible[k], " ");
            }
        }
        
        for(String s : babbling) {
            if(s.replace(" ", "").length() == 0) answer ++;
        }
        return answer;
    }
}