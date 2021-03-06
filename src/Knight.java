
public class Knight extends Chess{

	int[] moveX = {-2,-1,1,2,-2,-1,1,2};
	int[] moveY = {1,2,2,1,-1,-2,-2,-1};
	
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
		for(i=0;i<8;i++){
			if(x+moveX[i]>=0&&x+moveX[i]<8&&y+moveY[i]>=0&&y+moveY[i]<8){
				if(chessboard[x+moveX[i]][y+moveY[i]]==null)
					reachable[x+moveX[i]][y+moveY[i]] = true;
				else if(chessboard[x+moveX[i]][y+moveY[i]].camp!=camp){
					reachable[x+moveX[i]][y+moveY[i]] = true;
				}
			}
		}
		return reachable;
	}

	@Override
	public boolean isReachable(Chess[][] chessboard, int lx, int ly) {
		
		int i;
		boolean res;
		for(i=0;i<8;i++){
			if(x+moveX[i]>=0&&x+moveX[i]<8&&y+moveY[i]>=0&&y+moveY[i]<8){
				if(x+moveX[i]==lx&&y+moveY[i]==ly){
					if(chessboard[lx][ly]==null){
						res = true;
					}else if(chessboard[lx][ly].camp!=camp){
						res = true;
					}
				}
			}
		}
		return false;
	}

}
