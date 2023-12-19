import java.util.*;
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int min = sides[0];
        int max = sides[1];
        Set<Integer> set = new HashSet<>();
        for(int i=max-min+1; i<=max; i++) {
            set.add(i);
        }
        
        for(int i=max+1; i<min+max; i++) {
            set.add(i);
        }
        int answer = set.size();
        return answer;
    }
}