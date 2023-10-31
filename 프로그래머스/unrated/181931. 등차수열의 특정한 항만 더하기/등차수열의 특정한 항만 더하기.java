class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int index=0;
        int len = a+(included.length-1)*d;
        for(int k=a; k<=len; k+=d) {
            if(included[index])
                answer += k;
            index+=1;
        }
        return answer;
    }
}