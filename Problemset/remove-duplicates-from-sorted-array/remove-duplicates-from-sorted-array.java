
// @Title: 删除有序数组中的重复项 (Remove Duplicates from Sorted Array)
// @Author: 17816069684
// @Date: 2021-03-22 21:32:23
// @Runtime: 2 ms
// @Memory: 40.1 MB

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int i = 0,j = 1;
        while(j != nums.length){
            if (nums[j] == nums[i]){
                j++;
            }else {
                nums[++i]=nums[j++];
            }
        }
        return i+1;
    }
}
