
// @Title: 子集 (Subsets)
// @Author: 17816069684
// @Date: 2021-07-23 19:59:37
// @Runtime: 0 ms
// @Memory: 38.8 MB

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());

        for(int num:nums){
            List<List<Integer>> newSubsets = new ArrayList<List<Integer>>();
            for(List<Integer> subset:result){
                List<Integer> newSubset = new ArrayList<>(subset);
                newSubset.add(num);
                newSubsets.add(newSubset);
            }
            result.addAll(newSubsets);
        }
        return result;
    }
}
