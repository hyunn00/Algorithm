class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String reverse = "";
        for(int i=0; i<myString.length(); i++) {
            if(myString.charAt(i)== 'A') reverse += 'B';
            else reverse += 'A';
        }
        if(reverse.contains(pat)) answer = 1;
        return answer;
    }
}