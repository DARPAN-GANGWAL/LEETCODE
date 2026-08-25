class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int darpan = nums.length;

        if (darpan < 3) {
            return 0;
        }

        int current = 0;
        int total = 0;

        for (int i = 2; i < darpan; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                current++;
                total += current;
            } else {
                current = 0;
            }
        }

        return total;
    }
}