import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        // int[] -> List<Integer>
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());

        int last = num_list[num_list.length - 1];
        int secondLast = num_list[num_list.length - 2];

        if (last > secondLast) {
            list.add(last - secondLast);
        } else {
            list.add(last * 2);
        }

        // List<Integer> -> int[]
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
