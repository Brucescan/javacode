import java.util.Arrays;
public class HomeWork03{
	public static void main(String[] args){
		// int num = 1;
		// while(num<10){
		// 	System.out.println(num);
		// 	if(num>5){
		// 		break;
		// 	}
		// 	num+=2;
		// }

		//1
		//3
		//5
		//7
		

		//1、已知有一个升序的数组，要求插入一个元素，该数组的顺序依然是升序
		int[] arr = {10,12,45,90};
		//插入的数字是23，插入后变成10,12,23,45,90
		int[] arrNew = new int[arr.length+1];
		//初始化一个新的数组
		int index = -1;
		int insertNum = 23;
		for(int i = 0;i<arr.length;i++){
			if(arr[i]>insertNum){//进行定位
				if(index ==-1){//使用状态变量记录被顶替原先数组的位置并记录第一个找到的状态
					arrNew[i] = insertNum;
					index = i;
				}
				arrNew[i+1] = arr[index++];
				//将原来数组的位置的值赋给新数组后一位的值
				continue;
			}
			arrNew[i] = arr[i];

		}
		//注意这里有个隐藏条件，若是这个数比数组中所有元素都要大的话，那么我们要将他添加到最后一个
		if(index==-1){
			arrNew[arrNew.length-1] = insertNum;
		}
		arr = arrNew;
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}

	}
}