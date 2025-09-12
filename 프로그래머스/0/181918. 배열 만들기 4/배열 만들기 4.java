import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;
        while(i < arr.length){
            if(stk.isEmpty()) {stk.add(arr[i]); i++;}
            else if(stk.get(stk.size()-1) < arr[i]) {stk.add(arr[i]); i++;}
            else {stk.remove(stk.get(stk.size()-1)); }
        }
        int[] stk1 = stk.stream().mapToInt(Integer::intValue).toArray();
        return stk1;
    }
}