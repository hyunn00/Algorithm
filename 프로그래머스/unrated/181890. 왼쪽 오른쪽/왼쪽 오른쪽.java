import java.util.*;
class Solution {
    public List solution(String[] str_list) {
        List<String> list = Arrays.asList(str_list);
        List<String> answer = new ArrayList<>();
        
        for(int i=0; i<list.size(); i++) {
            if(list.get(i).equals("l")) {
                answer = list.subList(0, i);
                break;
            } else if(list.get(i).equals("r")) {
                answer = list.subList(i+1, list.size());
                break;
            }
        }
        return answer;
    }
}