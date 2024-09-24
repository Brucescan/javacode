//数组的必要性
// 数组也是一种数据类型，是引用类型(其中还包括类，接口等数据类型)
import java.util.Scanner;
public class ArrayExercise{
	public static void main(String[] args){
		//定义一个数组 double[]表示是double类型的数组
		//{3, 5, 1, 3.4, 2, 50};表示数组的值/元素
		// double[] hen = {3, 5, 1, 3.4, 2, 50};
		// //遍历数组得到数组的所有元素的和，使用for循环
		// for(int i = 0;i<6;i++){
		// 	System.out.println("第"+i+"个元素的值是"+hen[i]);
		// }
		
		//1、我们可以通过下标来对数组进行访问，注意是从0开始的
		//2、通过for可以循环的访问 数组的元素/值

		// 数组的三种使用方式
		// 1、动态初始化
		// 数组的定义
		// 数据类型 数组名[] = new 数据类型[大小]
		// Scanner myScanner = new Scanner(System.in);
		// //数组初始化
		// double[] scores = new double[5];
		// //数组的循环赋值
		// System.out.println("输入你的成绩：")
		// for(int i = 0;i<5;i++){
		// 	scores[i] = myScanner.nextDouble();
		// }
		// //数组的循环打印
		// for(int i = 0;i<5;i++){
		// 	System.out.println(scores[i]);
		// }
		
		//2、动态初始化
		//
		//先声明数组
		//数据类型[] 数组名;
		//
		//创建数组
		//数组名 = new 数据类型[大小];
		// int[] a;//声明数组，这时a是null
		// a = new int[10];//分配内存空间，可以存储数据
		

		//3、静态初始化
		// 即上面hens的用法即为静态初始化用法
		
		//细节问题
		//数组属于引用类型，数组型数据是对象(object);
		//数组创建后如果没有赋值会有默认值


	}
}
