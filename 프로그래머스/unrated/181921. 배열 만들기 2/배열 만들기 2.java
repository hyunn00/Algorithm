class Solution {
    public int[] solution(int l, int r) {
        String result = "";
        for(int i=l; i<=r; i++) {
            String strNum = String.valueOf(i);
            Boolean flag = true;
            
            for(int j=0; j<strNum.length(); j++) {
                if(strNum.charAt(j) != '5' && strNum.charAt(j) != '0') {
                    flag = false;
                }
            }
            if(flag) {
                result += strNum + "/";
            }
        }
        String[] strAnswer = result.split("/");
        int[] answer;
        
        if(strAnswer[0] == "") {
            answer = new int[]{-1};
        } else {
            answer = new int[strAnswer.length];

            int i=0;
            for(String s : strAnswer) {
                answer[i] = Integer.parseInt(s);
                i++;
            }
        }
        
        return answer;
    }
}