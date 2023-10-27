class Solution {
    public int solution(int a, int b) {
        int merge1 = 0;
        int merge2 = 0;
        merge1 = Integer.valueOf(Integer.toString(a)+Integer.toString(b));
        merge2 = Integer.valueOf(Integer.toString(b)+Integer.toString(a));
        
        return merge1>merge2 ? merge1 : merge2;
    }
}