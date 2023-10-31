class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int s=my_string.length()-1; s>=0; s--) {
            answer += my_string.charAt(s);
        }
        return answer;
    }
}