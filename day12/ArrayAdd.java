import java.util.Scanner;
import java.util.Arrays;
public class ArrayAdd{
	public static void main(String[] args){
		int[] arr = {1,2,3};//��ʼ����
		Scanner myScanner = new Scanner(System.in);//ʵ����ɨ��������
		while(true){//���ϵ�ѭ����֪���û������������˳�����
			System.out.println("�Ƿ������Ԫ�أ� y/n");//��ʾ����
			char c = myScanner.next().charAt(0);
			if (c=='y'){//�ж������
				System.out.println("������Ԫ�أ�");
				int num = myScanner.nextInt();//���������Ԫ��
				int[] arrNew = new int[arr.length+1];//����һ����԰���鳤�ȴ�һ��������
				for(int i = 0;i<arr.length;i++){
					arrNew[i] = arr[i];//��ԭ����������ݿ�������������
				}
				arrNew[arrNew.length-1] = num;//���û������������ӵ����һ��Ԫ��
				arr = arrNew;//��������ĵ�ַ����ԭ�ȵ�����
			}else{
				break;
			}
			System.out.println("���򵽴˾ͽ����ˡ�����������");
			System.out.println(Arrays.toString(arr));
		}
	}
}