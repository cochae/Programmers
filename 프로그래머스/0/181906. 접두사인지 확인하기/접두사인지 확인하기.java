class Solution {
    public int solution(String my_string, String is_prefix) {
        String[] arr = new String[my_string.length()];
        boolean result = false;
        for(int i = 0; i < my_string.length(); i++){
            arr[i] = my_string.substring(0, i + 1);
        }
        for(String s : arr){
            if(s.equals(is_prefix)) result = true;
        }
        return result ? 1 : 0;
    }
}