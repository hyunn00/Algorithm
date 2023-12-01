import java.util.*;

class Solution {
public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        for(char s : my_string.toCharArray()) {
            if(Character.isDigit(s)) {
                list.add(Integer.parseInt(String.valueOf(s)));
            }
        }
        Collections.sort(list);
        int listSize = list.size();
        int[] answer = new int[listSize];
        for(int i=0; i<listSize; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}