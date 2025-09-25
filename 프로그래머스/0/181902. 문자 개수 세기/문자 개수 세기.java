import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 0; i < my_string.length(); i++){
            for(int j = 0; j < 26; j++){
                if(my_string.charAt(i) == j + 65) answer[j]++; 
            }
        }
        
        for(int i = 0; i < my_string.length(); i++){
            for(int j = 0; j < 26; j++){
                if(my_string.charAt(i) == j + 97) answer[j+26]++; 
            }
        }
        return answer;
    }
}