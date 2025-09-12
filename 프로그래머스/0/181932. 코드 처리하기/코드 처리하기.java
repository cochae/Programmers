class Solution {
    public String solution(String code) {
        int mode = 0;
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);

            if (c == '1') {
                mode = 1-mode;
                continue;
            }

            if (i % 2 == mode) {
                answer.append(c);
            }
        }

        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}
