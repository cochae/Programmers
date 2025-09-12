class Solution {
    public int solution(String number) {
        int result = 0;
        for(int i = 0; i < number.length(); i++)
        {
            result += number.charAt(i)-'0';
        }    
        return result % 9;
    }
}