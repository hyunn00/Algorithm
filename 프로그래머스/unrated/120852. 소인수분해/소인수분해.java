import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int idx = 2;
        while(n != 1) {
            if(n%idx != 0) {
                
                idx++;
                continue;
            }
            n /= idx;
            if(!list.contains(idx))
                list.add(idx);
        }
        
        int listSize = list.size();
        int[] answer = new int[listSize];
        for(int i=0; i<listSize; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}