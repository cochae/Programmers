import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                result.add(arr[i]);
            }
        }
        return result;
    }
}