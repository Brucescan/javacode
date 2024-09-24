public class EightPrince{
	public static void main(String[] args){
		int[][] map = new int[8][8];
		Tool t  = new Tool();
		t.findWay(map,0,0);
		for(int i = 0;i<8;i++){
			for(int j = 0;j<8;j++){
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
}


class Tool{
	public boolean findWay(int[][] map,int i,int j){
		
	}
}