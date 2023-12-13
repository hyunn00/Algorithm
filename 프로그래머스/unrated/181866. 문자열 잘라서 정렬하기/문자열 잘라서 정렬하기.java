import java.util.*;
class Solution {
    public List solution(String myString) {
        String[] arr = (myString.split("x"));
        Arrays.sort(arr);
        List<String> answer = new ArrayList<>();
        for(String s : arr) {
            if(!s.equals("")) answer.add(s); 
        }
        return answer;
    }
}