import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        TreeMap<Integer, Integer> tree = new TreeMap<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i] == true) tree.put(rank[i], i);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (Integer key : tree.keySet()) {
            if (list.size() == 3) break;
            list.add(tree.get(key)); 
        }
        return list.get(0) * 10000 + list.get(1) * 100 + list.get(2);
    }
}