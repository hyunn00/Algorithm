class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] spl = my_string.split(" ");
        
        for(int i=0; i<=spl.length; i+=2) {
            if(i == 0) {
                answer = Integer.parseInt(spl[i]);
                continue;
            }
            
            if(spl[i-1].equals("+")) {
                answer += Integer.parseInt(spl[i]);
            } else {
                answer -= Integer.parseInt(spl[i]);
            }
        }
        return answer;
    }
}