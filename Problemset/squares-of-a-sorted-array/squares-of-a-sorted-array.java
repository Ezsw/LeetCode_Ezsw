
// @Title: 有序数组的平方 (Squares of a Sorted Array)
// @Author: 17816069684
// @Date: 2021-03-24 22:12:11
// @Runtime: 2 ms
// @Memory: 40.1 MB

class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length ; i++) {
            nums[i] = nums[i] * nums[i] ;
        }
        Arrays.sort(nums);
        return nums;
    }
}
