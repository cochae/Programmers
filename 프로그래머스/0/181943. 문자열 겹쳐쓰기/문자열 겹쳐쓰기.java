class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder();
        String part1 = my_string.substring(0, s);
        sb.append(part1);
        sb.append(overwrite_string);
        String part2 = my_string.substring(s+overwrite_string.length());
        sb.append(part2);
        String answer = sb.toString();
        return answer;
    }
}