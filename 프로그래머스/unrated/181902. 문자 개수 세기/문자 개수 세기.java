class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i=0; i<my_string.length(); i++) {
            int idx = my_string.charAt(i);
            if(idx <= 90) {
                idx -= 65;
            } else {
                idx = idx - 97 + 26;
            }
            answer[idx]++;
        }
        return answer;
    }
}