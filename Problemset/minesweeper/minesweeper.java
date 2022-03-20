
// @Title: 扫雷游戏 (Minesweeper)
// @Author: 17816069684
// @Date: 2021-01-25 18:53:54
// @Runtime: 1 ms
// @Memory: 39 MB

class Solution {
	int digitx[]= {0,1,0,-1,1,1,-1,-1};
	int digity[]= {1,0,-1,0,1,-1,1,-1};
	public char[][] updateBoard(char[][] board, int[] click) {
		int x=click[0];
		int y=click[1];
		if(board[x][y]=='M') { 
			board[x][y]='X';
		}else bfs(board,x,y);
		return 	board;
	}
	public void bfs(char[][] board,int x,int y) {		
		int cnt=0;
		for (int i=0;i<8;i++) {
			int temp1=x+digitx[i];
			int temp2=y+digity[i];
			if(temp1>=board.length||temp1<0||temp2<0||temp2>=board[0].length)  continue;
			if(board[temp1][temp2]=='M') cnt++;
		}
		if(cnt>0) {
			board[x][y]=(char) (cnt + '0');
		}else {
            board[x][y] = 'B';
            for (int i = 0; i < 8; ++i) {
            	int temp1= x + digitx[i];
            	int temp2= y + digity[i];
                if (temp1 < 0 || temp1 >= board.length || temp2 < 0 || temp2 >= board[0].length || board[temp1][temp2] != 'E') {
                    continue;
                }
                bfs(board, temp1, temp2);
            }
        }
		}
}
