class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for(int n1 : num_list)
            if(n1 == n) answer = 1;
        return answer;
    }
}