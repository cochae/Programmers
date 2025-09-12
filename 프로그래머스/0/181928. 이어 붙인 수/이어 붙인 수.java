class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String s1 = "";
        String s2 = "";
        for(int i : num_list){
            if(i % 2 == 0)
                s1 += i;
            else s2 += i;
        }
        return Integer.parseInt(s1) + Integer.parseInt(s2);
    }
}