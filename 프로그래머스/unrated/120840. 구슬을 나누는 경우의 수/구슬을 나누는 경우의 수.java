class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        double num1 = 1;
        double num2 = 1;
        for(int i = balls; i> balls-share; i--) {
            num1 *= i;
        }
        for(int i=share; i>0; i--) {
            num2 *= i;
        }
        answer = (int)(num1/num2);
        return answer;
    }
}