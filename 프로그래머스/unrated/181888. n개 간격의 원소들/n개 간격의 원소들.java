import java.util.*;
class Solution {
    public List solution(int[] num_list, int n) {
        int len = num_list.length;
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<len; i+=n) {
            answer.add(num_list[i]);
        }
        return answer;
    }
}