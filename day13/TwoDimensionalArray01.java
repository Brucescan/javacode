import java.util.Arrays;
public class TwoDimensionalArray01{
	public static void main(String[] args){
		//什么是二维数组，
		//1、从定义形式上看，int[][]
		//2、这样理解，原来一维数组的每个元素是一维数组，就构成了二维数组
		// int[][] arr = {{0,0,0,0,0,0},{0,0,1,0,0,0},{0,2,0,3,0,0},{0,0,0,0,0,0}};
		// for(int i = 0;i<arr.length;i++){//遍历二维数组的每个元素
		// 	//遍历二维数组的每个元素(数组)
		// 	for(int j = 0;j<arr[i].length;j++){
		// 		System.out.print(arr[i][j]+"\t");
		// 	}
		// 	System.out.println();
		// 	//注意，与c与c++中的数组不一样内存地址不是连续的。
		// }


		// int[][] arr;//先声明
		// arr = new int[2][3];//再申请内存


		//动态初始化，列数不确定的情况下可以使用
		//允许我们在第一个一维数组创建6个元素，第二个一维数组创建三个元素。
		int[][] arr = new int[3][];//列数不确定就可以先不写
		for(int i = 0;i<arr.length;i++){//遍历所有的一维数组
			//给每个一维数组开空间
			//如果没有给一维数组new，则arr[i]就是null
			arr[i] = new int[i + 1];

			//遍历一维数组，并给一维数组的每个元素
			for(int j = 0;j<arr[i].length;j++){
				arr[i][j] = i+1;
			}
		}

		// System.out.println(Arrays.toString(arr)); 这种方法是不行的，还是需要使用循环来进行展示
		


	}
}