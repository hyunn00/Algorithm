class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for(int i=0; i<queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            for(int j=s; j<=e; j++) {
                if(k == 0) {
                   answer[j]++;
                } else if(j == 0){
                    answer[j]++;
                } else {
                    if(j%k == 0) {
                        answer[j]++;
                    }
                }
            }
        }
        return answer;
    }
}