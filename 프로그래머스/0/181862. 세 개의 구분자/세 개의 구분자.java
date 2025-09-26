import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.split("[abc]+");
        List<String> list = new ArrayList<>();
        for(String s : answer){
            if(!s.equals("")) list.add(s);
        }
        return list.isEmpty() ? new String[]{"EMPTY"} : list.toArray(new String[0]);
    }
}