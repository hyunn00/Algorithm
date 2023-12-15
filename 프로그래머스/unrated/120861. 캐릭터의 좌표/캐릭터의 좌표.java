class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        for(String dir : keyinput) {
            switch(dir) {
                case "left" :
                    if(answer[0]-1 >= -((board[0]-1)/2)) answer[0]--;
                    break;
                case "right" :
                    if(answer[0]+1 <= (board[0]-1)/2) answer[0]++;
                    break;
                case "up" :
                    if(answer[1]+1 <= (board[1]-1)/2) answer[1]++;
                    break;
                case "down" :
                    if(answer[1]-1 >= -((board[1]-1)/2)) answer[1]--;
                    break;
            }
        }
        return answer;
    }
}