import java.util.*;
class Solution {
    public List solution(int[] arr, boolean[] flag) {
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<flag.length; i++) {
            if(flag[i]) {
                for(int k=0; k<arr[i] * 2; k++) {
                    answer.add(arr[i]);
                }
            } else {
                for(int k=0; k<arr[i]; k++) {
                    answer.remove(answer.size()-1);
                }
            }
        }
        return answer;
    }
}