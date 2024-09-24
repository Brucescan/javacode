import java.util.Arrays;
public class ArrayCopy{
	public static void main(String[] args){
		// 完成拷贝需求并且使用不同的数据空间
		// int[] arr1 = {10,20,30};
		// int[] arr2 = new int[arr1.length];
		// for(int i = 0;i<arr1.length;i++){
		// 	arr2[i] = arr1[i];
		// }
		// System.out.println(Arrays.toString(arr1));
		// System.out.println(Arrays.toString(arr2));
		// arr2[0] = 30;
		// System.out.println(Arrays.toString(arr1));
		// System.out.println(Arrays.toString(arr2));
		


		// Array类中也为我们提供了一种简便的方法
		int[] arr1 = {10,20,30};
		int[] arr2;
		//第一个参数是你要拷贝的数组的名称，第二个参数是新数组的长度，这个方法通常用来增加数组的大小
		//如果数组类型是数值型，那么额外的元素将被赋值为0；如果数组类型是boolean型，则将被赋值为false
		//相反，如果长度小于原始数组的长度，则只拷贝前面的值
		arr2 = Arrays.copyOf(arr1,2*arr1.length);
		System.out.println(Arrays.toString(arr2));
	}
}