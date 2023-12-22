class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int x=i; x<=j; x++) {
            String str = String.valueOf(x);
            answer += str.length() - str.replace(String.valueOf(k), "").length();
        }
        return answer;
    }
}