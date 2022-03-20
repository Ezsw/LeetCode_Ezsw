
// @Title: 最大连续 1 的个数 (Max Consecutive Ones)
// @Author: 17816069684
// @Date: 2020-09-01 22:29:46
// @Runtime: 2 ms
// @Memory: 40.5 MB

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0,tempMax=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                tempMax=Math.max(sum,tempMax);
                sum=0;
            }
            else {
                sum++;
            }
        }
    if(sum<tempMax){
        sum=tempMax;        
    } 
    return sum;
    }
}
