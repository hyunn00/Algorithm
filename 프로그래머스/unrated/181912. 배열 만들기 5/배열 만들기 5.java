import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for(String str : intStrs) {
            int subStr = Integer.parseInt(str.substring(s, s+l));
            if(subStr > k) {
                list.add(subStr);
            }
        }
        int listSize = list.size();
        int[] answer = new int[listSize];
        for(int i=0; i<listSize; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}