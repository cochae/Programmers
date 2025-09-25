import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int index_l = -1;
        int index_r = -1;
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l")) {
                index_l = i;
                break;
            }
            else if(str_list[i].equals("r")){
                index_r = i;
                break;
            }
        }
        if(index_l != -1){
            answer = Arrays.copyOf(str_list, index_l);
        }  
        else if(index_r != -1){
            answer = Arrays.copyOfRange(str_list, index_r+1, str_list.length);
        }
        return answer;
    }
}