
public class Solution {

    int temp = 0;

    public int[] reverseArray(int[] nums) {

        return Array(nums, 0, nums.length - 1);

    }

    public int[] Array(int[] num, int start, int end) {

        if (start >= end) {
            return num;
        }

        temp = num[start];
        num[start] = num[end];
        num[end] = temp;

        return Array(num, start + 1, end - 1);
    }

}
{
    
}
