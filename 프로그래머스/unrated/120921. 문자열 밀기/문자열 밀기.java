class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        int len = A.length();
        for(int i=0; i<len; i++) {
            String str = A.substring(len-i) + A.substring(0, len-i);
            if(str.equals(B)){
                answer = i;
                break;
            }
        }
        return answer;
    }
}