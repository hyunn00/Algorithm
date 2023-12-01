class Solution {
    public int solution(String my_string, String is_prefix) {
         int len = my_string.length();
        String[] arr = new String[len];
        for(int i=0; i<len; i++) {
            arr[i] = my_string.substring(0,i);
        }
        int answer = 0;
        for(String str : arr) {
            if(str.equals(is_prefix)) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}