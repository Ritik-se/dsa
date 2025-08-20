
public class Solution {
    // no of times element occures in the array

    public int getSum(int c, int B, ArrayList<Integer> A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {

            map.put(A.get(i), map.getOrDefault(A.get(i), 0) + 1);

        }
        int sum = 0;
        boolean bol = false;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == B) {
                bol = true;

                sum += entry.getKey();
            }
        }

        if (bol) {
            return sum % 1000000007;
        }
        return -1;

    }
