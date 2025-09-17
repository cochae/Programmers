import java.util.*;
class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        String s1 = "";
        for(int i = 0; i < intStrs.length; i++){
            s1 = intStrs[i].substring(s, s + l);
            if(Integer.parseInt(s1) > k) list.add(Integer.parseInt(s1));
        }
        return list;
    }
}