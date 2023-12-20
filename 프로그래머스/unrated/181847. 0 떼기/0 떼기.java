class Solution {
    public String solution(String n_str) {
        String answer = "";
        if(!n_str.startsWith("0")) return n_str;
        else {
            for(int i=0; i<n_str.length(); i++) {
                answer = n_str.substring(i+1);
                if(!answer.startsWith("0")) return answer;
            }
        }
        return answer;
    }
}