/**
 * Count_Number_of_Pairs_With_Absolute_Difference_K
 */
public class Count_Number_of_Pairs_With_Absolute_Difference_K {

    public int countKDifference(int[] nums, int k) {
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    res++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        
    }
}