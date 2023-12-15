import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int[] x = new int[4];
        int[] y = new int[4];
        int xidx = 0;
        int yidx = 0;
        for(int[] dot : dots) {
            x[xidx] = dot[0];
            xidx++;
            y[yidx] = dot[1];
            yidx++;
        }
        
        Arrays.sort(x);
        Arrays.sort(y);
        
        answer = (x[3] - x[0]) * (y[3] - y[0]);
        
        return answer;
    }
}