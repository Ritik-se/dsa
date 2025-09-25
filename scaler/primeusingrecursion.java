
public class Solution {

    public boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        return prime(num);

    }

    public boolean prime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

primeusingrecursion {
    
}
