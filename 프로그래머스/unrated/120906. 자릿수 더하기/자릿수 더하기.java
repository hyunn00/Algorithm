class Solution {
    public int solution(int n) {
        int answer = 0;
        char[] str = String.valueOf(n).toCharArray();
        for(char c : str) {
            answer += Integer.parseInt(String.valueOf(c));
        }
        return answer;
    }
}