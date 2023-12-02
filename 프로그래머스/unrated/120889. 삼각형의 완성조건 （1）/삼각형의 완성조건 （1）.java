import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 2;
        Arrays.sort(sides);
        int max = sides[2];
        int others = sides[0] + sides[1];
        
        if(max < others) {
            answer = 1;
        }
        return answer;
    }
}