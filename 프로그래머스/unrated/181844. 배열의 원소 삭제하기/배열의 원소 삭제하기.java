import java.util.*;
class Solution {
    public List solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        for(int a : arr) {
            boolean isContain = false;
            for(int d : delete_list) {
                if(a == d) {
                    isContain = true;
                    break;
                }
            }
            if(!isContain) answer.add(a);
        }
        return answer;
    }
}