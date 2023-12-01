import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        int idx = 0;
        while(idx < arr.length) {
            if(list.isEmpty()) {
                list.add(arr[idx]);
                idx++;
            } else if (list.get(list.size()-1) < arr[idx]) {
                list.add(arr[idx]);
                idx++;
            } else if(list.get(list.size()-1) >= arr[idx]){
                list.remove(list.size()-1);
            }
        }
        
        int listSize = list.size();
        int[] stk = new int[listSize];
        for (int i = 0; i < listSize; i++) {
            stk[i] = list.get(i);
        }
        return stk;
    }
}