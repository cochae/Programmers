import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            String s = String.valueOf(i);
            boolean check = true;
            
            for (char c : s.toCharArray()) {
                if (c != '0' && c != '5') {
                    check = false;
                    break;  // 불필요한 반복 방지
                }
            }
            
            if (check) {
                list.add(i);
            }
        }
        
        if (list.isEmpty()) return new int[] {-1};
        
        Collections.sort(list);  // 숫자 오름차순 정렬
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
