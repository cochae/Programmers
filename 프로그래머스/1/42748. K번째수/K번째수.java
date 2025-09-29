import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        int[] answer = {};
        for(int i = 0; i < commands.length; i++){
            answer = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(answer);
            result[i] = answer[commands[i][2]-1];
        }
        return result;
    }
}