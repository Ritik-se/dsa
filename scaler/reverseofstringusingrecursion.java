
class Solution {

    public void reverse(ArrayList<Character> n, int right, int left) {
        if (left >= right) {
            return;
        }
        char temp = n.get(left);
        n.set(left, n.get(right));
        n.set(right, temp);
        reverse(n, right - 1, left + 1);

    }

    public ArrayList<Character> reverseString(ArrayList<Character> n) {

        reverse(n, n.size() - 1, 0);
        return n;

    }

}
