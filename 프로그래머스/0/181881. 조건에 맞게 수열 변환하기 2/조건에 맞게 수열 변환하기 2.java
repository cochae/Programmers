import java.util.*;
class Solution {
    public int solution(int[] arr_after) {
        int answer = 0;
        int[] arr_before = arr_after.clone();
        while(true){
            for(int i = 0; i < arr_after.length; i++){
                if(arr_after[i] >= 50 && arr_after[i] % 2 == 0) arr_after[i] /= 2;
                else if(arr_after[i] < 50 && arr_after[i] % 2 == 1) arr_after[i] = arr_after[i] * 2 + 1;
            }
            answer++;
            if(Arrays.equals(arr_after, arr_before)) break;
            arr_before = arr_after.clone();
        }
        return --answer;
    }
}