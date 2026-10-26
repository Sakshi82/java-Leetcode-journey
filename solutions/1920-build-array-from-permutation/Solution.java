class Solution {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int nextIndex = nums[i];
            result[i] = nums[nextIndex];
        }
        return result;
    }
}
