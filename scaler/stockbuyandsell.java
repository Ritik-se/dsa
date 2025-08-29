//https://www.scaler.com/academy/mentee-dashboard/class/34604/homework/problems/14?navref=cl_tt_lst_sl

public class Solution {

    public int maxProfit(int[] A) {
        if (A.length == null || A.length == 0) {
            return 0;
        }

        int minPrice = A[0];
        int maxProfit = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] < minPrice) {
                minPrice = A[i]; // New lower buying price
            } else {
                int profit = A[i] - minPrice;
                if (profit > maxProfit) {// caareful with silly mistakes
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}
