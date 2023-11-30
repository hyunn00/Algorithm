class Solution {
    public int solution(String number) {
        int answer = 0;
        for(int i=0; i<number.length(); i++) {
            String n = String.valueOf(number.charAt(i));
            answer += Integer.parseInt(n);
        }
        answer %= 9;
        return answer;
    }
}