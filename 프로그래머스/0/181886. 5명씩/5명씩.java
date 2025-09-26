import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        String[] arr = new String[(names.length + 4) / 5];
        int idx = 0;
        for(int i = 0; i < names.length; i++){
            if(i % 5 == 0) arr[idx++] = names[i];
        }
        return arr;
    }
}