class Solution {
    public int[] solution(int n) {
        int[] answer;
        String result = Integer.toString(n) + "/";
        while(n != 1) {
            if(n%2 == 0) {
                n /= 2;
            } else {
                n = n*3 + 1;
            }
            result += Integer.toString(n) + "/";
        }
        
        String[] str = result.split("/");
        answer = new int[str.length];
        
        int i=0;
        for(String s : str) {
            answer[i] = Integer.parseInt(s);
            i++;
        }
        return answer;
    }
}