class Solution {
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        int[] answer = new int[len];
        
        for(int i=0; i<=len; i++) {
            int max = 0;
            int idx = 0;
            for(int j=0; j<len; j++) {
                if(answer[j] != 0) {
                    continue;
                }
                if (emergency[j] > max) {
                    max = emergency[j];
                    idx = j;
                }
            }
            answer[idx] = i;
        }
        return answer;
    }
}