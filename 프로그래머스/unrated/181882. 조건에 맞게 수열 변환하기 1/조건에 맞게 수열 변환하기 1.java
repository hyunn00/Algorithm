class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int[] answer = new int[len];
        int idx=0;
        for(int n : arr) {
            if(n >= 50 && n%2 == 0) {
                answer[idx] = arr[idx] / 2;
            } else if(n < 50 && n%2 != 0) {
                answer[idx]= arr[idx] * 2;
            } else {
                answer[idx] = arr[idx];
            }
            idx++;
        }
        return answer;
    }
}