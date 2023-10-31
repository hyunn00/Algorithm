class Solution {
    public int solution(int n, String control) {
        for(int s=0; s<control.length(); s++) {
            if(control.charAt(s)=='w')
                n +=1;
            else if(control.charAt(s)=='s')
                n -=1;
            else if(control.charAt(s)=='d')
                n +=10;
            else if(control.charAt(s)=='a')
                n -=10;
        }
        return n;
    }
}