class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);

        for (int[] q : queries) {
            int start = q[0];
            int end = q[1] + 1;

            sb.replace(start, end, new StringBuilder(sb.substring(start, end)).reverse().toString());
        }

        return sb.toString();
    }
}
