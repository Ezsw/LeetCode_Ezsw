
// @Title: 斐波那契数 (Fibonacci Number)
// @Author: 17816069684
// @Date: 2021-01-04 14:26:45
// @Runtime: 0 ms
// @Memory: 35.2 MB

class Solution {
    public int fib(int n) {
        if(n==0||n==1){
            return n;
        }
        int[] record=new int[3];
        record[0]=0;
        record[1]=1;
        record[2]=0;
        for(int i=2;i<=n;i++){
            record[i%3]=record[(i-1)%3]+record[(i-2)%3];                                        
        }
        return record[n%3];
    }
}
