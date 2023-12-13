import java.util.*;
class Solution {
    public List solution(String myString) {
        myString = "/"+myString+"/";
        List<Integer> answer = new ArrayList<>();
        String[] arr = myString.split("x");
        System.out.println(Arrays.toString(arr));
        for(String s : arr) {
            answer.add(s.length());
        }
        answer.set(0, answer.get(0)-1);
        answer.set(answer.size()-1, answer.get(answer.size()-1)-1);
        return answer;
    }
}