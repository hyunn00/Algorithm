class Solution {
    public int solution(int n) {
        int answer = 0;
        int result = 1;
        while(result*(answer+1) <= n) {
            answer++;
            result *= answer;
            System.out.println(answer + " " + result);
        }
        return answer;
    }
}