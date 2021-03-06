
public class Rock extends Chess{

	@Override
	public void setImage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean[][] getReachableGrid(Chess[][] chessboard) {
		
		boolean reachable[][] = new boolean[8][8];
	
		int i = 0,j = 0;
		for(i=0;i<8;i++)
			for(j=0;j<8;j++)
				reachable[i][j] = false;
		
		for(i=y;i<8;i++){
			if(chessboard[x][i]==null)
				reachable[x][i] = true;
			else if(chessboard[x][i].camp!=camp){
				reachable[x][i] = true;
				break;
			}
			else break;
		}
		
		for(i=y;i>=0;y--){
			if(chessboard[x][i]==null)
				reachable[x][i] = true;
			else if(chessboard[x][i].camp!=camp){
				reachable[x][i] = true;
				break;
			}
			else break;
		}
		
		for(i=x;i<8;i++){
			if(chessboard[i][y]==null)
				reachable[i][y] = true;
			else if(chessboard[i][y].camp!=camp){
				reachable[i][y] = true;
				break;
			}
			else break;
		}
		for(i=x;i>=0;i--){
			if(chessboard[i][y]==null)
				reachable[i][y] = true;
			else if(chessboard[i][y].camp!=camp){
				reachable[i][y] = true;
				break;
			}
			else break;
		}
		
		reachable[x][y] = false;
		
		return reachable;
	}

	@Override
	public boolean isReachable(Chess[][] chessboard, int lx, int ly) {
		
		boolean res = false;
		int i;
		
		if(x==lx||y==ly){
			if(x==lx){
				for(i=lx;i<8;i++){
					if((chessboard[x][i]==null)){
						if(i==ly)
							res = true;
					}else if(chessboard[x][i].camp!=camp){
						if(i==ly){
							res = true;
							break;
						}
					}else break;
				}
			}
			else{
				for(i=ly;i<8;i++){
					if((chessboard[i][y]==null)){
						if(i==lx)
							res = true;
					}else if(chessboard[i][y].camp!=camp){
						if(i==lx){
							res = true;
							break;
						}
					}else break;
				}
			}
		}
		
		return res;
	}

}
