import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        List<Integer> list1 = new ArrayList<>();
        for (int n : arr) {
            list1.add(n);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int n : delete_list) {
            list2.add(n);
        }
        list1.removeAll(list2);
        return list1;
    }
}