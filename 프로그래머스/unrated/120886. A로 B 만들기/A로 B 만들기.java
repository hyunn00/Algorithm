class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        for(int i=0; i<before.length(); i++) {
            int idx = after.indexOf(String.valueOf(before.charAt(i)));
            if(idx == -1) break;
            after = after.substring(0, idx) + "/" + after.substring(idx+1);
        }
        if(after.replaceAll("/", "").length() == 0) answer = 1;
        return answer;
    }
}