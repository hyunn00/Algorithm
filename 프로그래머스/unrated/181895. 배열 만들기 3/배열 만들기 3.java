class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int i1_start = intervals[0][0];
        int i1_end = intervals[0][1];
        int i2_start = intervals[1][0];
        int i2_end = intervals[1][1];
        
        int totalLen = (i1_end - i1_start + 1) + (i2_end - i2_start + 1);
        int[] answer = new int[totalLen];
        
        for(int i=i1_start; i<i1_end+1; i++) {
            answer[i-i1_start] = arr[i];
        }
        
        for(int i=i2_start; i<i2_end+1; i++) {
            answer[(i1_end - i1_start + 1)+i-i2_start] = arr[i];
        }
        return answer;
    }
}