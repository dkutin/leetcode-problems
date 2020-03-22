class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        int num = 0;
        int[] sol = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            num = nums[i];
            for (int sm : nums) {
                if (num > sm) {
                    count++;
                }
            }
            sol[i] = count;
            count = 0;
        }
        return sol;
    }
}