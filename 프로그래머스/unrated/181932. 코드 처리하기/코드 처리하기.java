class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        int idx = 0;
        while (idx < code.length()) {
            if (code.charAt(idx) == '1') {
                if (mode == 1) {
                    mode = 0;
                } else if(mode == 0) {
                    mode = 1;
                }
                idx += 1;
                continue;
            }
            
            if (mode==0 && idx%2==0) {
                answer += code.charAt(idx);
            } else if(mode==1 && idx%2!=0) {
                answer += code.charAt(idx);
            }
            
            idx +=1;
        }
        
        if (answer=="") {
            answer = "EMPTY";
        }
        return answer;
    }
}