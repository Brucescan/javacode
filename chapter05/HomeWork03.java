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
		

		//1����֪��һ����������飬Ҫ�����һ��Ԫ�أ��������˳����Ȼ������
		int[] arr = {10,12,45,90};
		//�����������23���������10,12,23,45,90
		int[] arrNew = new int[arr.length+1];
		//��ʼ��һ���µ�����
		int index = -1;
		int insertNum = 23;
		for(int i = 0;i<arr.length;i++){
			if(arr[i]>insertNum){//���ж�λ
				if(index ==-1){//ʹ��״̬������¼������ԭ�������λ�ò���¼��һ���ҵ���״̬
					arrNew[i] = insertNum;
					index = i;
				}
				arrNew[i+1] = arr[index++];
				//��ԭ�������λ�õ�ֵ�����������һλ��ֵ
				continue;
			}
			arrNew[i] = arr[i];

		}
		//ע�������и��������������������������������Ԫ�ض�Ҫ��Ļ�����ô����Ҫ������ӵ����һ��
		if(index==-1){
			arrNew[arrNew.length-1] = insertNum;
		}
		arr = arrNew;
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}

	}
}