class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] len = new int[30];
        for(String s : strArr) {
            len[s.length()-1]++;
        }
        for(int i=0; i<30; i++) {
            if(len[i] > answer){
                answer = len[i];
            }
        }
        return answer;
    }
}