class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = (num_list.length + n - 1) / n;
        int[] result = new int[size];
        
        int idx = 0;
        for (int i = 0; i < num_list.length; i += n) {
            result[idx++] = num_list[i];
        }
        
        return result;
    }
}