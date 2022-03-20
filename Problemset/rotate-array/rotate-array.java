
// @Title: 轮转数组 (Rotate Array)
// @Author: 17816069684
// @Date: 2021-01-08 13:26:42
// @Runtime: 0 ms
// @Memory: 38.8 MB

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; ++i) {
            newArr[(i + k) % n] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, n);
    }
}

