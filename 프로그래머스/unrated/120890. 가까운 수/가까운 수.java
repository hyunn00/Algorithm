import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : array) {
            if(num == n) {
                return n;
            }
            int gap = Math.abs(num - n);
            map.put(num, gap);
        }

        Integer value1 = map.lowerKey(n);
        Integer value2 = map.higherKey(n);
        
        if (value1 == null) {
            return value2;
        } else if (value2 == null) {
            return value1;
        }
        return map.get(value1) <= map.get(value2) ? value1 : value2;
    }
}