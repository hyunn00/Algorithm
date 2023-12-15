import java.util.*;
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
        int none = 0;
        String[] arr = polynomial.split(" ");
        for(String str : arr) {
            if(str.contains("x")) {
                String s = str.replace("x", "");
                if(s.equals("")) s += "1";
                x += Integer.parseInt(s);
            } else {
                try {
                    none += Integer.parseInt(str);
                } catch(Exception e) {}
            }
        }
        if(x > 1) {
            answer += x + "x";
        } else if (x == 1) {
            answer += "x"; 
        }
        if(none!=0) {
            if(x == 0) answer += none;
            else answer += " + " + none;
        }
        return answer;
    }
}