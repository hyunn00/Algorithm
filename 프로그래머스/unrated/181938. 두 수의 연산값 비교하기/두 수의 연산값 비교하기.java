class Solution {
    public int solution(int a, int b) {
        int merge = Integer.valueOf(Integer.toString(a)+Integer.toString(b));
        int calc = 2 * a * b;
        return merge > calc ? merge : calc;
    }
}