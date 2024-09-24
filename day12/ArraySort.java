import java.util.Arrays;
public class ArraySort{
	public static void main(String[] args){
		//排序的分类
		//1、内部排序
		//指将需要处理的所有数据都加载到内部存储器中进行排序，包括(交换式排序法，选择式排序法，插入式排序法)
		//2、外部排序法
		//数据量过大，无法全部加载到内存中，需要借助外部存储进行排序。包括(合并排序法和直接合并排序法)
		int[] arr = {123,345,23,567,11,96,234,345,124};
		// for(int i = 0;i<arr.length;i++){
		// 	for(int j = i+1;j<arr.length;j++){
		// 		if(arr[i]>arr[j]){
		// 			arr[i] = arr[i]^arr[j];
		// 			arr[j] = arr[i]^arr[j];
		// 			arr[i] = arr[i]^arr[j];
		// 		}
		// 	}
		// }
		//冒泡排序
		for(int i = 0;i<arr.length-1;i++){
			for(int j = 0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					arr[j] = arr[j]^arr[j+1];
					arr[j+1] = arr[j]^arr[j+1];
					arr[j] = arr[j]^arr[j+1];
				}
			}
		}
		

		System.out.println("排序后的数组===================");
		System.out.println(Arrays.toString(arr));
		
	}
}