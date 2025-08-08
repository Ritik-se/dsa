
public class Solution {

    public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            if (map.containsKey(A.get(i) ^ B)) {
                count++;
            }
            map.put(A.get(i), map.getOrDefault(A.get(i), 0) + 1);

        }
        return count;
    }
}
