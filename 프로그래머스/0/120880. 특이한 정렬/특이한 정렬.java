import java.util.*;
class Solution {
    public List<Integer> solution(int[] numlist, int n) {
        List<Integer> answer = new ArrayList<>();
        TreeSet<Integer> list = new TreeSet<>();
        for(int num : numlist) {
            list.add(num);
        }
        if(Objects.equals(list.ceiling(n), n)) {
            answer.add(n);
            list.remove(n);
        }
        while(!list.isEmpty()) {
            Integer ceiling = list.ceiling(n);
            Integer floor = list.floor(n);
            if(ceiling != null && floor != null) {
                if(ceiling-n == n-floor) {
                    answer.add(ceiling);
                    answer.add(floor);
                    list.remove(ceiling);
                    list.remove(floor);
                } else if (ceiling-n > n-floor) {
                    answer.add(floor);
                    list.remove(floor);
                } else if(ceiling-n < n-floor) {
                    answer.add(ceiling);
                    list.remove(ceiling);
                }
            } else {
                if(ceiling == null && floor != null) {
                    answer.add(floor);
                    list.remove(floor);
                } else {
                    answer.add(ceiling);
                    list.remove(ceiling);
                }
            }
        }
        return answer;
    }
}