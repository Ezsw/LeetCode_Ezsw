
// @Title: 单词搜索 (Word Search)
// @Author: 17816069684
// @Date: 2021-01-30 11:20:12
// @Runtime: 10 ms
// @Memory: 39.2 MB

class Solution {
    public boolean exist(char[][] board, String word) {
        int len=word.length();
        int m=board.length;int n=board[0].length;
        boolean[][] used=new boolean[m][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                   if(dfs(board,used,0,word,len,i,j)) return true;
            }}
        return false;
    }
    public boolean dfs(char[][] board,boolean[][] used,int k,String word,int len,int i,int j){
        if(board[i][j]!=word.charAt(k)) return false;        
        if(k==word.length()-1) return true;
        used [i][j]=true;
        int[][]directions={{0,1},{0,-1},{1,0},{-1,0}};
        for(int []dir:directions){
            int newi=i+dir[0],newj=j+dir[1];
            if (newi >= 0 && newi < board.length && newj >= 0 && newj < board[0].length) {
                if (!used[newi][newj]) {
                    boolean flag=dfs(board, used, k + 1,word,len, newi, newj);
                    if(flag==true){
                        return true;
                    }else continue;
                }    
            }
        }
        used[i][j] = false;
        return false;
    }
}
