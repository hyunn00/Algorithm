class Solution {
    public int lengthOfLastWord(String s) {
        String[] strArr = s.split(" ");
        int answer = strArr[strArr.length -1].length();
        return answer;
    }
}