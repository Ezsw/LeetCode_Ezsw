
// @Title: 提莫攻击 (Teemo Attacking)
// @Author: 17816069684
// @Date: 2020-09-02 08:09:04
// @Runtime: 2 ms
// @Memory: 41.9 MB

class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalTime=0;
        int n=timeSeries.length;
        if(n==0){
            return 0;
        }
        if(n==1){
            return duration;
        }
        for(int i=1;i<n;i++){
            totalTime=totalTime+Math.min(duration,timeSeries[i]-timeSeries[i-1]);
        }
        return totalTime+duration;
    }
}


