import java.util.Scanner;
import java.util.Arrays;
public class ArrayReduce{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		Scanner myScanner = new Scanner(System.in);
		do{
			int[] arrNew = new int[arr.length-1];
			for(int i = 0;i<arrNew.length;i++){
				arrNew[i] = arr[i];
			}
			System.out.println("是否删减元素： y/n");
			if(arrNew.length==0){
				System.out.println("只剩下最后一个元素，不能再缩减了");
				break;
			}
			char c = myScanner.next().charAt(0);
			if(c=='n'){
				break;
			}
			arr = arrNew;
			System.out.println("当前数组是=======");
			System.out.println(Arrays.toString(arr));
		} while(true);

	}
}