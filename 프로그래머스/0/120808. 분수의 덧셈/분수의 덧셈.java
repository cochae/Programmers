class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int mom = denom1 * denom2; //분모
        int son = numer1 * denom2 + numer2 * denom1; //분자
        for(int i = Math.min(mom, son); i >= 1; i--){
            if(son % i == 0 && mom % i == 0)
               { mom /= i; son /= i;}
        }
        int[] answer = new int[]{son, mom};
        return answer;
    }
}