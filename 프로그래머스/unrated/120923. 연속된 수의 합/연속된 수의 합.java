class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int idx =-100;
        while(true) {
            int sum = 0;
            for(int i=idx; i<num+idx; i++) {
                sum += i;
            }
            if(sum == total) {
                for(int i=0; i<num; i++) {
                    answer[i] = idx+i;
                }
                break;
            }
            idx++;
        }
        return answer;
    }
}