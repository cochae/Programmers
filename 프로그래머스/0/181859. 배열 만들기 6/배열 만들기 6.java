import java.util.*;
class Solution {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            if(stk.empty()) stk.push(arr[i]);
            else if(stk.peek() == arr[i]) stk.pop();
            else stk.push(arr[i]);
        }
        if (stk.empty()) {
            stk.push(-1);
        }
        return stk;
    }
}