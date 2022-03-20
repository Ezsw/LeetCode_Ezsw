
// @Title: 较大分组的位置 (Positions of Large Groups)
// @Author: 17816069684
// @Date: 2021-01-05 11:47:34
// @Runtime: 1 ms
// @Memory: 38.5 MB

class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        int n = s.length();
        int num = 1;
        for (int i = 0; i < n; i++) {
            if (i == n - 1 || s.charAt(i) != s.charAt(i + 1)) {
                if (num >= 3) {
                    ret.add(Arrays.asList(i - num + 1, i));
                }
                num = 1;
            } else {
                num++;
            }
        }
        return ret;
    }
}
