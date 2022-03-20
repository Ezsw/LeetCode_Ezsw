
// @Title: 组合 (Combinations)
// @Author: 17816069684
// @Date: 2021-07-25 10:51:29
// @Runtime: 1 ms
// @Memory: 39.8 MB

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        traverse(n,k,1);
        return res;
    }
    public void traverse(int n, int k ,int index){
        if(path.size() == k){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = index;i <= n-(k-path.size())+1; i++){
            path.add(i);
            traverse(n, k, i+1);
            path.removeLast();
        }
    }
}
