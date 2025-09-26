import java.util.*;
class Solution {
    public List<String> solution(String myString) {
        String[] answer = myString.split("x");
        List<String> list = new ArrayList<>();
        for(String n : answer){
            if(!n.equals(""))
                list.add(n);
        }
        list.sort(null);
        return list;
    }
}