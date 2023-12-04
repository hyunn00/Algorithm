class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int len = num_list.length;
        switch (n) {
            case 1 :
                answer = new int[b+1];
                for(int i=0; i<b+1; i++) {
                    answer[i] = num_list[i];
                }
                break;
            case 2 :
                answer = new int[len-a];
                for(int i=a; i<len; i++) {
                    answer[i-a] = num_list[i];
                }
                break;
            case 3 :
                answer = new int[b-a+1];
                for(int i=a; i<b+1; i++) {
                    answer[i-a] = num_list[i];
                }
                break;
            case 4 :
                answer = new int[((b-a)/c)+1];
                int idx = 0;
                for(int i=a; i<b+1; i+=c) {
                    answer[idx] = num_list[i];
                    idx++;
                }
                break;
        }
        return answer;
    }
}