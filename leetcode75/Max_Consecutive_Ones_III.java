public class Max_Consecutive_Ones_III {
    public static int longestOnes(int[] nums, int k) {
        int ans = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        while (j < nums.length) {
            if (nums[j] == 0) {
                count++;
                if (count > k) {
                    while (nums[i] != 0) {
                        i++;
                    }
                    i++;
                    count--;
                }
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        System.out.println(longestOnes(nums, 2));
    }
}
