class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        int[] dice = new int[6];
        dice[a-1]++;
        dice[b-1]++;
        dice[c-1]++;
        dice[d-1]++;
        
        int max = -1;
        int idx = 0;
        for(int i=0; i<6; i++) {
            if(dice[i] >= max) {
                max = dice[i];
                idx = i+1;
            }
        }
        
        switch(max) {
            case 4 :
                answer = 1111 * (idx);
                break;
            case 3 :
                int q = 0;
                for(int i=0; i<6; i++) {
                    if(dice[i] == max) {
                        continue;
                    } else if(dice[i] > 0) {
                        q = i+1;
                    }
                    
                }
                answer = (10 * idx + q) * (10 * idx + q);
                break;
            case 2 :
                q = 0;
                for(int i=0; i<6; i++) {
                    if(idx-1 == i) {
                        continue;
                    } else if(dice[i] == 2) {
                        q = i+1;
                        break;
                    }
                }
                if (q > 0) {
                    answer = idx > q ?
                        (idx + q) * (idx - q) :
                        (idx + q) * (q - idx) ;
                    break;
                }
                q=0;
                int r = 0;
                for(int i=0; i<6; i++) {
                    if(q == 0 && dice[i] == 1) {
                        q = i+1;
                    }
                    if(i != q-1 && dice[i] == 1) {
                        r = i+1;
                    }
                }
                
                answer = (q * r);
                break;
            default :
                int min = 6;
                for(int i=0; i<6; i++) {
                    if(dice[i] > 0 && i < min) {
                        min = i+1;
                    }
                }
                answer = min;
        }
        
        return answer;
    }
}