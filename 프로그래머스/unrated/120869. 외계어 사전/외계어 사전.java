class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(String str : dic) {
            boolean isContain = true;
            for (String ch : spell) {
                isContain = isContain && str.contains(ch);
            }
            if(isContain)
                return 1;
        }
        return answer;
    }
}