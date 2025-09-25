
class Solution {

    public int addDigits(int num) {
        if (num <= 9) {
            return num;
        }
        int ans = summission(num, 0);
        return addDigits(ans);

    
    /// reducing till we get single digit 
        //ans
}
public int summission(int i, int sum) {
        if (i == 0) {
            return sum;
        }
        sum += (i % 10);
        return summission(i / 10, sum);

    }

}
