import java.util.*;
class Solution {
    public List solution(String my_str, int n) {
        List<String> answer = new ArrayList<>();
        for(int i=0; i<my_str.length(); i+=n) {
            if(i+n > my_str.length()) {
                answer.add(my_str.substring(i));
                break;
            }
            answer.add(my_str.substring(i,i+n));
        }
        return answer;
    }
}