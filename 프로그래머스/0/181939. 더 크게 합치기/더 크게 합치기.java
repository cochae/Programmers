class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String first = "" + a + b;
        String second = "" + b + a;
        if(Integer.parseInt(first) > Integer.parseInt(second)){
            answer = Integer.parseInt(first);
        }
        else answer = Integer.parseInt(second);
        return answer;
    }
}