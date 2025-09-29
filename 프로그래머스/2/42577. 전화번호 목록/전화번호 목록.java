import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>(Arrays.asList(phone_book));

        for (String number : phone_book) {
            String prefix = "";
            for (int i = 0; i < number.length() - 1; i++) {
                prefix += number.charAt(i);
                if (set.contains(prefix)) {
                    return false;
                }
            }
        }
        return true;
    }
}
