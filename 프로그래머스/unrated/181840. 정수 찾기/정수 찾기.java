import java.util.*;
class Solution {
    public int solution(int[] num_list, int n) {
        Integer[] arr = new Integer[num_list.length];
        for(int i=0; i<num_list.length; i++) {
            arr[i] = num_list[i];
        }
        int answer = 0;
        if(Arrays.asList(arr).contains((Integer)n))
            answer = 1;
        return answer;
    }
}