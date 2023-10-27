class Solution {
    public int solution(int[] array) {
        int[] arr = new int[1001];
        for(int i=0; i<array.length; i++) {
            arr[array[i]]++;
        }
        int maxValue = -1;
        int answer = -1;
        for(int i=0; i<arr.length; i++) {
            if(maxValue < arr[i]) {
                maxValue = arr[i];
                answer = i;
            } else if(maxValue == arr[i]) {
                answer = -1;
            }
        }
        return answer;
    }
}