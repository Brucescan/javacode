import java.util.Arrays;
public class TwoDimensionalArray01{
	public static void main(String[] args){
		//ʲô�Ƕ�ά���飬
		//1���Ӷ�����ʽ�Ͽ���int[][]
		//2��������⣬ԭ��һά�����ÿ��Ԫ����һά���飬�͹����˶�ά����
		// int[][] arr = {{0,0,0,0,0,0},{0,0,1,0,0,0},{0,2,0,3,0,0},{0,0,0,0,0,0}};
		// for(int i = 0;i<arr.length;i++){//������ά�����ÿ��Ԫ��
		// 	//������ά�����ÿ��Ԫ��(����)
		// 	for(int j = 0;j<arr[i].length;j++){
		// 		System.out.print(arr[i][j]+"\t");
		// 	}
		// 	System.out.println();
		// 	//ע�⣬��c��c++�е����鲻һ���ڴ��ַ���������ġ�
		// }


		// int[][] arr;//������
		// arr = new int[2][3];//�������ڴ�


		//��̬��ʼ����������ȷ��������¿���ʹ��
		//���������ڵ�һ��һά���鴴��6��Ԫ�أ��ڶ���һά���鴴������Ԫ�ء�
		int[][] arr = new int[3][];//������ȷ���Ϳ����Ȳ�д
		for(int i = 0;i<arr.length;i++){//�������е�һά����
			//��ÿ��һά���鿪�ռ�
			//���û�и�һά����new����arr[i]����null
			arr[i] = new int[i + 1];

			//����һά���飬����һά�����ÿ��Ԫ��
			for(int j = 0;j<arr[i].length;j++){
				arr[i][j] = i+1;
			}
		}

		// System.out.println(Arrays.toString(arr)); ���ַ����ǲ��еģ�������Ҫʹ��ѭ��������չʾ
		


	}
}