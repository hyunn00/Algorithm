class Solution {
    public int[] solution(int[] arr) {
        int idx = 0;
        while(Math.pow(2, idx) < arr.length) {
            idx++;
        }
        int[] answer = new int[(int)Math.pow(2, idx)];
        for(int i=0; i<arr.length; i++) {
            if(i < arr.length) answer[i] = arr[i];
            else answer[i] = 0;
        }
        return answer;
    }
}