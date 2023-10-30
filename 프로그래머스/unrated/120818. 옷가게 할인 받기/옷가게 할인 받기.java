class Solution {
    public int solution(int price) {
        int answer = 0;
        if (price >= 100000) {
            if (price >= 300000) {
                if (price >= 500000) {
                    return (int)(price*0.8);
                }
                return (int)(price*0.9);
            }
            return (int)(price*0.95);
        }
        return price;
    }
}