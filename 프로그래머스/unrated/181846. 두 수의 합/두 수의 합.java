class Solution {
    public String solution(String a, String b) {
        String answer = "";
        int alen = a.length();
        int blen = b.length();
        int max = Math.max(alen, blen);
        int min = Math.min(alen, blen);
        
        int alpa=0;
        if(alen > min) {
            for(int i=0; i<max-min; i++) {
                b = "0" + b;
            }
        } else {
            for(int i=0; i<max-min; i++) {
                a = "0" + a;
            }
        }
        System.out.println(a);
        System.out.println(b);
        for(int i=max-1; i>=0; i--) {
            int an = Integer.parseInt(String.valueOf(a.charAt(i)));
            int bn = Integer.parseInt(String.valueOf(b.charAt(i)));
            if((an + bn+ alpa) <10) {
                answer = (an + bn + alpa) + answer;
                alpa=0;
            } else {
                answer = (an + bn + alpa - 10) + answer;
                alpa=1;
            }
        }
        
        if(alpa > 0) {
            answer = alpa + answer;
        }
        
        return answer;
    }
}