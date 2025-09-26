import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < names.length; i++){
            if(i % 5 == 0) list.add(names[i]);
        }
        String[] arr = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}