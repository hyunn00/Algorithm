class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] arrStr = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int idx = 0;
        for(String s : arrStr) {
            numbers = numbers.replace(s, String.valueOf(idx));
            idx++;
        }
        answer = Long.parseLong(numbers);
        return answer;
    }
}