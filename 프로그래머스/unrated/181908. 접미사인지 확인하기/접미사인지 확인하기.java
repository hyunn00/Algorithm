class Solution {
    public int solution(String my_string, String is_suffix) {
        int len = my_string.length();
        String[] arr = new String[len];
        for(int i=0; i<len; i++) {
            arr[i] = my_string.substring(i);
        }
        int answer = 0;
        for(String str : arr) {
            if(str.equals(is_suffix)) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}