import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        TreeMap<Integer, Double> avg = new TreeMap<>();
        for(int i=0; i<score.length; i++){
            avg.put(i, (score[i][0] + score[i][1])/2.0);
        }
        List<Integer> keySet = new ArrayList<>(avg.keySet());
        keySet.sort((o1, o2) -> avg.get(o2).compareTo(avg.get(o1)));
        
        System.out.println(keySet);

        int rank = 0;
        int e = 0;
        while (rank<keySet.size()) {
            if(rank <keySet.size()-1 && avg.get(keySet.get(rank+1)).equals(avg.get(keySet.get(rank)))) {
                answer[keySet.get(rank)] = rank + 1-e;
                rank++;
                e++;
            } else if(rank <keySet.size()-1 && !avg.get(keySet.get(rank+1)).equals(avg.get(keySet.get(rank)))){
                answer[keySet.get(rank)] = rank+1 -e;
                e = 0;
                rank++;
            } else {
                answer[keySet.get(rank)] = rank+1-e;
                rank++;
            }
        }
        return answer;
    }
}