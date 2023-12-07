import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int[] arr = new int[26];
        char[] str = s.toCharArray();
        for(char c : str) {
            arr[c-97]++;
        }
        for(int i=0; i<26; i++) {
            if(arr[i] == 1) {
               answer += (char)(i+97);
            }
        }
        return answer;
    }
}