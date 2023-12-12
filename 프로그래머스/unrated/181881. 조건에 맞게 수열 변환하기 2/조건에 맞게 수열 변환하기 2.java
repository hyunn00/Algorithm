import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] prev = new int[arr.length];
        while(!Arrays.equals(arr, prev)) {
            prev = Arrays.copyOf(arr, arr.length);
            int idx=0;
            for(int n : arr) {
                if(n >= 50 && n%2 == 0) {
                    arr[idx] = arr[idx] / 2;
                } else if(n < 50 && n%2 != 0) {
                    arr[idx]= arr[idx] * 2 +1;
                } else {
                    arr[idx] = arr[idx];
                }
                idx++;
            }
            answer++;
        }
        return answer-1;
    }
}