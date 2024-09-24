import java.util.Scanner;
import java.util.Arrays;
public class ArrayAdd{
	public static void main(String[] args){
		int[] arr = {1,2,3};//初始数组
		Scanner myScanner = new Scanner(System.in);//实例化扫描器对象
		while(true){//不断的循环，知道用户输入其他答案退出即可
			System.out.println("是否添加新元素： y/n");//提示输入
			char c = myScanner.next().charAt(0);
			if (c=='y'){//判断输入答案
				System.out.println("输入新元素：");
				int num = myScanner.nextInt();//接受输入的元素
				int[] arrNew = new int[arr.length+1];//创建一个闭园数组长度大一的新数组
				for(int i = 0;i<arr.length;i++){
					arrNew[i] = arr[i];//将原来数组的内容拷贝到新数组中
				}
				arrNew[arrNew.length-1] = num;//将用户输入的数字添加到最后一个元素
				arr = arrNew;//将新数组的地址赋给原先的数组
			}else{
				break;
			}
			System.out.println("程序到此就结束了。。。。。。");
			System.out.println(Arrays.toString(arr));
		}
	}
}