class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        sb.append(my_string.substring(0, s));
        sb1.append(my_string.substring(s, e + 1));
        sb1.reverse();
        sb.append(sb1);
        sb.append(my_string.substring(e + 1));
        
        return sb.toString();
    }
}