public class TwoDimensionalExercise{
	public static void main(String[] args){
		//二维数组细节
		//二维数组的声明方式有    int[][] y 或者 int[] y[] 或者 int y[][]
		
		//声明：int[] x,y[]; 以下选项允许通过编译的是：
		int[] x,y[];
		x[0] = y;//不对，将一个二维数组赋给int类型
		y[0] = x;//ok 这就是一个二维数组
		y[0][0] = x;//不对
		x[0][0] = y;//x没有这麽多索引
		y[0][0] = x[0];//ok
		x = y;//不对
	}
}