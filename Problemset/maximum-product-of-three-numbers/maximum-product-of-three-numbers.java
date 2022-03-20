
// @Title: 三个数的最大乘积 (Maximum Product of Three Numbers)
// @Author: 17816069684
// @Date: 2020-09-04 20:54:40
// @Runtime: 12 ms
// @Memory: 40.5 MB

public class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }
}

