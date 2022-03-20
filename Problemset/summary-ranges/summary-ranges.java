
// @Title: 汇总区间 (Summary Ranges)
// @Author: 17816069684
// @Date: 2021-01-10 13:57:02
// @Runtime: 0 ms
// @Memory: 36.6 MB

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<String>();
        int i = 0, n = nums.length;
        while (i < n) {
            String str = "";
            str += Integer.toString(nums[i]);
            int j = i + 1;  //区间结束位
            while (j < n && nums[j] == nums[j - 1] + 1) j++;  //尝试合并区间
            if (j != i + 1) {  //说明有需要合并的区间
                str += "->";
                str += Integer.toString(nums[j - 1]);
            }
            i = j;
            res.add(str);
        }
        return res;
    }
}

