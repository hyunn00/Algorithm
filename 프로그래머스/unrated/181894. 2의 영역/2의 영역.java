class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int start = -1;
        int end = -1;
        for(int i=0; i<arr.length; i++) {
            if(start == -1 && arr[i] == 2) {
                start = i;
            } else if (start != -1 && arr[i] == 2) {
                end = i;
            }
        }
        
        if(start == -1) {
            answer = new int[]{-1};
        } else if (end == -1) {
            answer = new int[]{2};
        } else {
            answer = new int[end - start + 1];
            for(int i=start; i<end+1; i++) {
                answer[i-start] = arr[i];
            }
        }
        
        return answer;
    }
}