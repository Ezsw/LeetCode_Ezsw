
// @Title: 最接近的三数之和 (3Sum Closest)
// @Author: 17816069684
// @Date: 2021-03-22 09:12:16
// @Runtime: 10 ms
// @Memory: 38.4 MB

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);  //确保数组从小到大排序
//        System.out.println(Arrays.toString(nums));
        int x,y;
        int best=1000;
        for(int i=0 ;i<nums.length; i++){
            x= i+1;
            y= nums.length-1;
            while(x<y ) {
                if (Math.abs(nums[i] + nums[x] + nums[y] - target) < (Math.abs(best-target))) {
                    best=nums[i]+nums[x]+nums[y];
                }
                if(nums[i] + nums[x] + nums[y] - target > 0) y--;
                else x++;
            }
        }
        return best;
    }
}
