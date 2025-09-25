import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] arr1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
        int[] arr2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);
        int[] answer = new int[arr1.length + arr2.length];
        for(int i = 0; i < answer.length; i++){
            if(i < arr1.length)
                answer[i] = arr1[i];
            else
                answer[i] = arr2[i-arr1.length];
        }
        return answer;
    }
}