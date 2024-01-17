class Solution {
    public int solution(int chicken) {
        int answer = 0;
        while(chicken >= 10) {
            int div = chicken / 10;
            int rem = chicken % 10;
            chicken = div + rem;
            answer += div;
        }
        return answer;
    }
}