class Solution {
    public int solution(int[][] board) {
        int[][] arr = new int[board.length + 2][board[0].length + 2];
        int answer = 0;
        for(int i=1; i<arr.length-1; i++) {
            for(int j=1; j<arr[i].length-1; j++) {
                arr[i][j] = board[i-1][j-1];
            }
        }
        
        for(int i=1; i<arr.length-1; i++) {
            for(int j=1; j<arr[i].length-1; j++) {
                if(arr[i][j] == 1) {
                    arr[i][j-1] = arr[i][j-1] != 1 ? 2 : arr[i][j-1];
                    arr[i][j+1] = arr[i][j+1] != 1 ? 2 : arr[i][j+1];
                    arr[i+1][j] = arr[i+1][j] != 1 ? 2 : arr[i+1][j];
                    arr[i+1][j-1] = arr[i+1][j-1] != 1 ? 2 : arr[i+1][j-1];
                    arr[i+1][j+1] = arr[i+1][j+1] != 1 ? 2 : arr[i+1][j+1];
                    arr[i-1][j] = arr[i-1][j] != 1 ? 2 : arr[i-1][j];
                    arr[i-1][j+1] = arr[i-1][j+1] != 1 ? 2 : arr[i-1][j+1];
                    arr[i-1][j-1] = arr[i-1][j-1] != 1 ? 2 : arr[i-1][j-1];
                }
            }
        }
        
        for(int i=1; i<arr.length-1; i++) {
            for(int j=1; j<arr[i].length-1; j++) {
                if(arr[i][j]==0) {
                    System.out.println(i + " " + j);
                    answer++;
                } 
            }
        }
        return answer;
    }
}