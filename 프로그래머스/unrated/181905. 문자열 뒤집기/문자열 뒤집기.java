class Solution {
    public String solution(String my_string, int s, int e) {
        String desc = "";
        for(int i=e; i>=s; i--) {
            desc += my_string.charAt(i);
        }
        String answer = my_string.substring(0, s) + desc + my_string.substring(e+1);
        return answer;
    }
}