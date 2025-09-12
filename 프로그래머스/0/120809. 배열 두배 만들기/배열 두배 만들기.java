import java.util.*;
class Solution {
    public List<Integer> solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for(int i : numbers) list.add(i*2);
        return list;
    }
}