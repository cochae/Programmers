class Solution {
    public int[] solution(int[] arr, int n) {
        if(arr.length % 2 == 1){
            for(int i = 0; i < arr.length;){
                arr[i] += n;
                i += 2;
            }
        }
        else
            for(int i = 0; i < arr.length-1;){
                arr[i+1] += n;
                i += 2;
            }
        return arr;
    }
}