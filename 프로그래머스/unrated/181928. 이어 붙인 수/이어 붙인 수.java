class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String oddStr = "";
        String evenStr = "";
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i]%2==0) {
                oddStr += Integer.toString(num_list[i]);
            } else {      
                evenStr += Integer.toString(num_list[i]);      
            }
        }
        answer = Integer.valueOf(oddStr) + Integer.valueOf(evenStr);
        return answer;
    }
}