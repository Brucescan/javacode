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
			System.out.println("�Ƿ�ɾ��Ԫ�أ� y/n");
			if(arrNew.length==0){
				System.out.println("ֻʣ�����һ��Ԫ�أ�������������");
				break;
			}
			char c = myScanner.next().charAt(0);
			if(c=='n'){
				break;
			}
			arr = arrNew;
			System.out.println("��ǰ������=======");
			System.out.println(Arrays.toString(arr));
		} while(true);

	}
}