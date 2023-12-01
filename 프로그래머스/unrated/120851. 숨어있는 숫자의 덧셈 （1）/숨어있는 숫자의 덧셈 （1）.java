class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(char s : my_string.toCharArray()) {
            if(Character.isDigit(s)) {
                answer += Integer.parseInt(String.valueOf(s));
            }
        }
        return answer;
    }
}