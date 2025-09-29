import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {

        int[] dice = { a, b, c, d };
        Arrays.sort(dice);

        if (dice[0] == dice[3]) {
            return 1111 * dice[3];
        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            return (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            return (dice[0] + dice[3]) * (dice[3] - dice[0]);
        } else if (dice[0] == dice[1]) {
            return dice[2] * dice[3];
        } else if (dice[1] == dice[2]) {
            return dice[0] * dice[3];
        } else if (dice[2] == dice[3]) {
            return dice[0] * dice[1];
        } else {
            return dice[0];
        }
    }
}