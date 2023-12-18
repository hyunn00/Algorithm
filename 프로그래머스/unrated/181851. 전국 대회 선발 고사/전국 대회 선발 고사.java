import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i=0; i<rank.length; i++) {
            if(attendance[i]) map.put(rank[i], i);
        }
        System.out.println(map);
        
        int idx = 1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(idx == 1) {
                answer += entry.getValue() * 10000;
                idx++;
            } else if(idx == 2) {
                answer += entry.getValue() * 100;
                idx++;
            } else if(idx == 3) {
                answer += entry.getValue();
                idx++;
            } else break;
        }
        return answer;
    }
}