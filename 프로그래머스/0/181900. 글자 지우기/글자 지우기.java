import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        String[] arr = my_string.split("");
        for(int i : indices){
            arr[i] = "";
        }
        for(String s : arr) sb.append(s);
        return sb.toString();
    }
}