import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr, int k) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i = 0; i < arr.length; i++){
            if(set.size() >= k) break;
            set.add(arr[i]);
        }
        List<Integer> list = new ArrayList<>(set);
        while(list.size() < k)
            list.add(-1);
        
        return list;
    }
}