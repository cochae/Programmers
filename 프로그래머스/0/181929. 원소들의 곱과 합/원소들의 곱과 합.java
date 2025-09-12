class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int multi = 1;
        for(int i : num_list){
            sum += i;
            multi *= i;
        }
        return sum*sum > multi ? 1 : 0;
    }
}