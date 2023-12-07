import java.util.*;

class Solution {
    public List solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        for(int num : num_list) {
            list.add(num);
        }
        
        List<Integer> answer = new ArrayList<>();
        switch(n) {
            case 1 :
                answer = list.subList(0, slicer[1]+1);
                break;
            case 2 :
                answer = list.subList(slicer[0], list.size());
                break;
            case 3 :
                answer = list.subList(slicer[0], slicer[1]+1);
                break;
            case 4 :
                for(int i=slicer[0]; i<=slicer[1]; i+=slicer[2]) {
                    answer.add(list.get(i));
                }
                break;
        }
        return answer;
    }
}