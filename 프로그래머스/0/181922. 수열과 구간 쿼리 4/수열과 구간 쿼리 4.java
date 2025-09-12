import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] arr01 = Arrays.copyOf(arr, arr.length);
        for(int i = 0; i < queries.length; i++){
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                if(j % queries[i][2] == 0) arr01[j] += 1;
            }
        }
        return arr01;
    }
}