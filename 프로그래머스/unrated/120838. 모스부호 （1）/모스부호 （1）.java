class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] letterArr = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-",
            "-.--","--.."};
        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                       'j', 'k','l', 'm', 'n', 'o', 'p', 'q', 'r',
                        's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int s=0; s<letterArr.length; s++) {
            for(int m=0; m<morse.length; m++) {
                if(letterArr[s].equals(morse[m])) {
                    answer += alpha[m];
                }
            }
        }
        return answer;
    }
}