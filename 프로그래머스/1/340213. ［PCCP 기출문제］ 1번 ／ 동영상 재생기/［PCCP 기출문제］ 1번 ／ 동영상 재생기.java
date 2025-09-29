class Solution {
    private int toMinutes(String time) {
        return Integer.parseInt(time.substring(0, 2)) * 60 + Integer.parseInt(time.substring(3, 5));
    }

    private int skipOp(int time, int opStart, int opEnd) {
        if (time >= opStart && time <= opEnd) return opEnd;
        return time;
    }

    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int current = toMinutes(pos);
        int opStart = toMinutes(op_start);
        int opEnd = toMinutes(op_end);
        int videoTime = toMinutes(video_len);

        current = skipOp(current, opStart, opEnd);

        for (String cmd : commands) {
            if (cmd.equals("next")) {
                current = Math.min(current + 10, videoTime);
            } else if (cmd.equals("prev")) {
                current = Math.max(current - 10, 0);
            }
            current = skipOp(current, opStart, opEnd);
        }

        return String.format("%02d:%02d", current / 60, current % 60);
    }
}
