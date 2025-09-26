class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("A", "C"); // CBBCC
        myString = myString.replace("B", "A"); // CAACC
        myString = myString.replace("C", "B"); // BAABB
        
        return myString.contains(pat) ? 1 : 0;
    }
}