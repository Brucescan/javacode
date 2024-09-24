public class HomeWork05{
	public static void main(String[] args){
		// char[] arr1 = {'a','z','b','c'};
		// char[] arr2 = arr1;
		// arr1[2] = '韩';

		// for(int i = 0;i<arr2.length;i++){
		// 	System.out.println(arr1[i]+","+arr2[i]);
		// }
		//输出
		//a,a
		//z,z
		//韩，韩
		//c,c
		


		//徒手撸冒泡循环
		int[] arr = {23,45,123,5657,1232,2344,129};
		for(int i = 0;i<arr.length-1;i++){//外层循环。这层循环的意思是几轮比较
			for(int j=0;j<arr.length-i-1;j++){//每一轮的比较次数
				if(arr[j]>arr[j+1]){
					//异或进行交换
					arr[j] = arr[j]^arr[j+1];
					arr[j+1] = arr[j]^arr[j+1];
					arr[j] = arr[j]^arr[j+1];
				}

			}
		}
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		


		//你真是个天才！！！！！！
	}
}