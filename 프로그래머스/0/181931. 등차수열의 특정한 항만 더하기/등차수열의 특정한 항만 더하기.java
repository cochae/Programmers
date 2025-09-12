import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i = 0; i < included.length; i++){
            if(included[i]) answer += a + i*d;
        }
        return answer;
    }
}