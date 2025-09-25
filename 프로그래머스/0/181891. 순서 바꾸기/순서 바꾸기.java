import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer1 = {};
        int[] answer2 = {};
        answer1 = Arrays.copyOfRange(num_list, n, num_list.length);
        answer2 = Arrays.copyOf(num_list, n);
        int[] result = new int[answer1.length + answer2.length];
        System.arraycopy(answer1, 0, result, 0, answer1.length);
        System.arraycopy(answer2, 0, result, answer1.length, answer2.length);

        return result;
    }
}